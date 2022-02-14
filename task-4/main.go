package main

import (
	"context"
	"fmt"
	"log"
	"github.com/vartanbeno/go-reddit/v2/reddit"
)

var ctx = context.Background()

func main() {

	if err := run(); err != nil {
		log.Fatal(err)
	}
}

func run() (err error) {
	// Let's get the top 100 posts of r/memes.
	memes, _, err := reddit.DefaultClient().Subreddit.TopPosts(ctx, "memes", &reddit.ListPostOptions{
		ListOptions: reddit.ListOptions{Limit: 100,},
		Time: "7d",})

	if err != nil {
		return
	}



	client,c := reddit.NewClient(reddit.Credentials{ID: "APP_ID", Secret: "SECRET_ID", Username: "YOUR_USERNAME", Password: "..."})
        if c!= nil{}
	for _, post := range memes {
		fmt.Println(post.Title)
		c, err := client.Post.Upvote(context.Background(), post.ID)
        if err != nil {
        return err
	}
        if c!= nil{}}

	return
}
