import { createApp } from 'vue';
import AppVue from './AppVue.vue';
import i18next from './i18n';
import I18NextVue from 'i18next-vue';
// seed4j-needle-main-ts-import

const app = createApp(AppVue);
app.use(I18NextVue, { i18next });
// seed4j-needle-main-ts-provider
app.mount('#app');
