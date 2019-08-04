<template>
    <form>
        <div><label for="title">Title: </label><input type="text" v-model="title" /></div>
        <div><label for="contents">Contents: </label><textarea v-model="contents" /></div>
        <div><label for="topic">Topic: </label><input type="text" v-model="topic" /></div>
        <button v-on:click="register">登録</button>
    </form>
</template>

<script lang="ts">
import { Component, Prop, Vue } from 'vue-property-decorator';
import Articles from './../../api/articles/articles';

@Component
export default class MiraiArticleForm extends Vue{

    /** タイトル */
    private title: string = "";
    
    /** 内容 */
    private contents: string = "";

    /** トピック */
    private topic: string = "";

    /** 入力された内容を登録する */
    private register() : void {
        const articles = new Articles;
        articles.saveArticles(this.title, this.contents, this.topic);
    }
}
</script>
