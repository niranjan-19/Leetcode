# Write your MySQL query statement below
SELECT
    tweets.tweet_id
    FROM
        tweets
        WHERE
            LENGTH(tweets.content) > 15