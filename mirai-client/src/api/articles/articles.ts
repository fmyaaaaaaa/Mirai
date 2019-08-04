import client from 'axios';
import ArticleMsg from './msg/ArticleMsg';

export default class Articles {

    /**
     * articlesを取得します。
     */
    public getArticlles(): any {
        return client.get('http://localhost:8085/articles/list');
    }
    /**
     * articlesを保存します。
     * @param title タイトル
     * @param contents 内容
     * @param topic トピック
     */
    public async saveArticles(title: string, contents: string, topic: string) {
        const articleMsg = new ArticleMsg(title, contents, topic);
        const res = await client.post('http://localhost:8085/articles/save', articleMsg);
        return res;
    }
}
