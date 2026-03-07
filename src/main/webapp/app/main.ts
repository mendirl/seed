import { createApp } from 'vue';
import AppVue from './AppVue.vue';
import i18next from './i18n';
import I18NextVue from 'i18next-vue';
import { provideForAuth } from '@/auth/application/AuthProvider';
import { KeycloakHttp } from '@/auth/infrastructure/secondary/KeycloakHttp';
import Keycloak from 'keycloak-js';
import router from './router';
// seed4j-needle-main-ts-import

const app = createApp(AppVue);
app.use(I18NextVue, { i18next });
const keycloakHttp = new KeycloakHttp(
  new Keycloak({
    url: 'http://localhost:9080',
    realm: 'seed4j',
    clientId: 'web_app',
  }),
);

provideForAuth(keycloakHttp);
app.use(router);
// seed4j-needle-main-ts-provider
app.mount('#app');
