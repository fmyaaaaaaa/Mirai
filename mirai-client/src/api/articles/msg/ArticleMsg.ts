export default class ArticleMsg {
    private title: string;
    private contents: string;
    private topic: string;

    constructor(title: string, contents: string, topic: string) {
        this.title = title;
        this.contents = contents;
        this.topic = topic;
    }
}
