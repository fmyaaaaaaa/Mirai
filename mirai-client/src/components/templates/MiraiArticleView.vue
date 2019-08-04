<template>
    <div class="articles">
        <MiraiArticleForm />
    </div>
</template>

<script lang="ts">
import { Component, Vue } from 'vue-property-decorator';
import MiraiArticleForm from './../molecules/MiraiArticleForm.vue';

@Component({
    components: {
        MiraiArticleForm,
    },
})
export default class MiraiArticleView extends Vue {}
</script>
