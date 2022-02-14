#!/bin/bash

#Making sure we dont have previos files
rm -rf temp
mkdir temp

#Remove if you want previous data of commits.json
rm -rf commits.json

#Getting Repositories data from GitHub API's and storing in repos.json file
org_name="cognizance-amrita"
curl -H "Accept: application/vnd.github.v3+json"  https://api.github.com/orgs/$org_name/repos >> temp/repos.json

#Trimming full details into repository names
grep full_name  temp/repos.json >> temp/repo_names.json
fmt -1 < temp/repo_names.json >> temp/names_converted.txt


while read p;
do

x=${p/'"full_name":'/ ''};
y=${x/'"'/''};
x=${y/'"'/''};
y=${x/','/''};
echo $y >> temp/names_trimmed.txt

done <temp/names_converted.txt

grep "\S" temp/names_trimmed.txt >>  temp/names_final.txt

#Welcome perceval to get commit history of repo's available
while read p;
do
rep_link="https://github.com/$p"
echo "-------------- Commits of $rep_link ------------------" >> commits.json
perceval git --json-line $rep_link >> commits.json
done <temp/names_final.txt

rm -rf temp
