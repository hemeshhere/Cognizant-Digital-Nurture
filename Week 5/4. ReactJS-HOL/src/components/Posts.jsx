import React, { Component } from 'react';
import Post from './Post';
class Posts extends Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],
            hasError: false
        };
    }
    componentDidMount() {
        const fetchedPosts = [
            new Post(1, 'First Post', 'This is the body of the first post.'),
            new Post(2, 'Second Post', 'This is the body of the second post.')
        ];
        
        this.setState({ posts: fetchedPosts });
    }
    componentDidCatch(error, info) {
        console.error("Caught an error:", error, info);
        this.setState({ hasError: true });
    }

    render() {
        if (this.state.hasError) {
            return <h2>Something went wrong loading the posts.</h2>;
        }

        return (
            <div>
                <h2>Blog Posts List</h2>
                <ul>
                    {this.state.posts.map(post => (
                        <li key={post.id}>
                            <h3>{post.title}</h3>
                            <p>{post.body}</p>
                        </li>
                    ))}
                </ul>
            </div>
        );
    }
}

export default Posts;