webpackJsonp([37],{"4ml/":function(e,n){},BseR:function(e,n,t){"use strict";var a=t("xcSH");t.n(a);n.a={getClientHeight:function(){return document.body.clientHeight&&document.documentElement.clientHeight?document.body.clientHeight<document.documentElement.clientHeight?document.body.clientHeight:document.documentElement.clientHeight:document.body.clientHeight>document.documentElement.clientHeight?document.body.clientHeight:document.documentElement.clientHeight},toast:function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:"",n=arguments.length>1&&void 0!==arguments[1]?arguments[1]:"text",t=arguments.length>2&&void 0!==arguments[2]?arguments[2]:"bottom",o=arguments.length>3&&void 0!==arguments[3]&&arguments[3],r=arguments.length>4&&void 0!==arguments[4]&&arguments[4],i={type:n,position:t,message:e,icon:arguments.length>5&&void 0!==arguments[5]?arguments[5]:"",mask:o,forbidClick:r};Object(a.Toast)(i)}}},CAO6:function(e,n){},ILFG:function(e,n){},NHnr:function(e,n,t){"use strict";Object.defineProperty(n,"__esModule",{value:!0});var a=t("lRwf"),o=t.n(a),r={render:function(){var e=this.$createElement,n=this._self._c||e;return n("div",{attrs:{id:"app"}},[n("router-view")],1)},staticRenderFns:[]};var i=t("VU/8")({name:"App"},r,!1,function(e){t("CAO6")},null,null).exports,u=t("pRNm"),s=t.n(u);o.a.use(s.a);var c=new s.a({routes:[{path:"/",name:"index",component:function(){return Promise.all([t.e(0),t.e(1)]).then(t.bind(null,"2NXm"))},meta:{noShadow:!0}},{path:"/ziXun",name:"ziXun",component:function(){return Promise.all([t.e(0),t.e(16)]).then(t.bind(null,"6qg/"))}},{path:"/baiKeDetail/:id",name:"baiKeDetail",component:function(){return Promise.all([t.e(0),t.e(35)]).then(t.bind(null,"aSMo"))}},{path:"/ziXunServe/:cId/:cateName",name:"ziXunServe",component:function(){return Promise.all([t.e(0),t.e(34)]).then(t.bind(null,"NKR2"))}},{path:"/lawyerList/:sId/:cateName",name:"lawyerList",component:function(){return Promise.all([t.e(0),t.e(29)]).then(t.bind(null,"ea+T"))}},{path:"/lawyerDetail/:lawId",name:"lawyerDetail",component:function(){return Promise.all([t.e(0),t.e(19)]).then(t.bind(null,"l1Hk"))}},{path:"/addZiXun/:lawyerId/:cateId/:cateName/:lawyerName",name:"addZiXun",component:function(){return Promise.all([t.e(0),t.e(21)]).then(t.bind(null,"BWdl"))},meta:{needLogin:!0}},{path:"/addYearServe/:lawId",name:"addYearServe",component:function(){return Promise.all([t.e(0),t.e(30)]).then(t.bind(null,"eMS1"))},meta:{needLogin:!0}},{path:"/payZiXun/:orderNo",name:"payZiXun",component:function(){return Promise.all([t.e(0),t.e(17)]).then(t.bind(null,"+pge"))},meta:{needLogin:!0}},{path:"/findLawyerIndex",name:"findLawyerIndex",component:function(){return Promise.all([t.e(0),t.e(8)]).then(t.bind(null,"+atO"))}},{path:"/searchList/:sId/:cateName",name:"searchList",component:function(){return Promise.all([t.e(0),t.e(33)]).then(t.bind(null,"YGIg"))}},{path:"/searchLaywer",name:"searchLaywer",component:function(){return Promise.all([t.e(0),t.e(2)]).then(t.bind(null,"Ijid"))}},{path:"/lawFile",name:"lawFile",component:function(){return Promise.all([t.e(0),t.e(5)]).then(t.bind(null,"3XoL"))}},{path:"/addLawFile",name:"addLawFile",component:function(){return Promise.all([t.e(0),t.e(31)]).then(t.bind(null,"/iY6"))},meta:{needLogin:!0}},{path:"/payLawFile/:orderNo",name:"payLawFile",component:function(){return Promise.all([t.e(0),t.e(20)]).then(t.bind(null,"Uu4k"))},meta:{needLogin:!0}},{path:"/complateOrder",name:"complateOrder",component:function(){return Promise.all([t.e(0),t.e(24)]).then(t.bind(null,"H9+l"))}},{path:"/niShen",name:"niShen",component:function(){return Promise.all([t.e(0),t.e(6)]).then(t.bind(null,"y5yV"))}},{path:"/addNiShen/:id/:conName",name:"addNiShen",component:function(){return Promise.all([t.e(0),t.e(10)]).then(t.bind(null,"kXkb"))},meta:{needLogin:!0}},{path:"/payNiShen/:orderNo",name:"payNiShen",component:function(){return Promise.all([t.e(0),t.e(15)]).then(t.bind(null,"nkpM"))}},{path:"/my",name:"my",component:function(){return Promise.all([t.e(0),t.e(3)]).then(t.bind(null,"XJOZ"))},meta:{needLogin:!0}},{path:"/myLawyer/:type",name:"myLawyer",component:function(){return Promise.all([t.e(0),t.e(28)]).then(t.bind(null,"3mCp"))},meta:{needLogin:!0}},{path:"/myMessage",name:"myMessage",component:function(){return Promise.all([t.e(0),t.e(4)]).then(t.bind(null,"wwJY"))},meta:{needLogin:!0}},{path:"/editInfo",name:"editInfo",component:function(){return Promise.all([t.e(0),t.e(7)]).then(t.bind(null,"ArKQ"))},meta:{needLogin:!0}},{path:"/editPwd",name:"editPwd",component:function(){return Promise.all([t.e(0),t.e(27)]).then(t.bind(null,"H2TO"))},meta:{needLogin:!0}},{path:"/myOrder",name:"myOrder",component:function(){return Promise.all([t.e(0),t.e(11)]).then(t.bind(null,"GVfn"))},meta:{needLogin:!0}},{path:"/orderDetail",name:"orderDetail",component:function(){return Promise.all([t.e(0),t.e(32)]).then(t.bind(null,"/OqR"))},meta:{needLogin:!0}},{path:"/chongzhi",name:"chongzhi",component:function(){return Promise.all([t.e(0),t.e(9)]).then(t.bind(null,"Cah1"))},meta:{needLogin:!0}},{path:"/myZiXun",name:"myZiXun",component:function(){return Promise.all([t.e(0),t.e(23)]).then(t.bind(null,"mAMc"))},meta:{needLogin:!0}},{path:"/ziXunDetail/:orderNo/:orderStatus",name:"ziXunDetail",component:function(){return Promise.all([t.e(0),t.e(13)]).then(t.bind(null,"ina9"))},meta:{needLogin:!0}},{path:"/pubComment/:orderNo",name:"pubComment",component:function(){return Promise.all([t.e(0),t.e(22)]).then(t.bind(null,"r9DK"))},meta:{needLogin:!0}},{path:"/pubTouSu/:orderNo/:lawyer",name:"pubTouSu",component:function(){return Promise.all([t.e(0),t.e(18)]).then(t.bind(null,"o1tk"))},meta:{needLogin:!0}},{path:"/myAppend",name:"myAppend",component:function(){return Promise.all([t.e(0),t.e(26)]).then(t.bind(null,"01cK"))},meta:{needLogin:!0}},{path:"/phoneLogin/:hasLogin",name:"phoneLogin",component:function(){return Promise.all([t.e(0),t.e(14)]).then(t.bind(null,"dcKu"))}},{path:"/accountLogin/:hasLogin",name:"accountLogin",component:function(){return Promise.all([t.e(0),t.e(12)]).then(t.bind(null,"pktI"))}},{path:"/register",name:"register",component:function(){return Promise.all([t.e(0),t.e(25)]).then(t.bind(null,"M/F+"))}},{path:"*",redirect:"/"}]}),l=t("xcSH"),m=t.n(l),d=(t("4ml/"),t("sVYa"),t("ILFG"),{apiUrl:"http://law.xulongbiao.cn"});o.a.filter("picUrl",function(e){return d.apiUrl+"/"+e}),o.a.filter("pubType",function(e){switch(e){case 1:return"用户";case 2:return"律师"}}),o.a.filter("money",function(e){return e>0?"+"+e:"-"+e}),o.a.filter("isRead",function(e){switch(e){case 1:return"标位已读";case 2:return"已读"}}),o.a.filter("starRank",function(e){switch(e){case 1:return"差";case 2:return"还好";case 3:return"一般";case 4:return"满意";case 5:return"非常满意"}});var p=t("qCxf"),h=t("//Fk"),f=t.n(h),g=t("OMN4"),b=t.n(g),v=t("ohH5"),L=t("mw3O"),y=t.n(L),w=d.apiUrl;function k(){var e={message:arguments.length>0&&void 0!==arguments[0]?arguments[0]:"加载中...",position:arguments.length>1&&void 0!==arguments[1]?arguments[1]:"bottom"};Object(l.Toast)(e)}b.a.defaults.timeout=5e3,b.a.defaults.baseURL=w,b.a.defaults.responseType="json",b.a.interceptors.request.use(function(e){var n=v.a.get("token");return n&&(e.headers["X-Token"]=""+n),e},function(e){return k(e),f.a.reject(e)}),b.a.interceptors.response.use(function(e){return e.data},function(e){if(e&&e.response)switch(e.response.status){case 400:e.message="请求错误(400)";break;case 401:e.message="未授权，请重新登录(401)";break;case 403:e.message="拒绝访问(403)";break;case 404:e.message="请求出错(404)";break;case 408:e.message="请求超时(408)";break;case 500:e.message="服务器错误(500)";break;case 501:e.message="服务未实现(501)";break;case 502:e.message="网络错误(502)";break;case 503:e.message="服务不可用(503)";break;case 504:e.message="网络超时(504)";break;case 505:e.message="HTTP版本不受支持(505)";break;default:e.message="连接出错("+e.response.status+")!"}else e.message="连接服务器失败!";return l.Toast.clear(),k(e.message),f.a.reject(e)});var P={get:function(e){var n=arguments.length>1&&void 0!==arguments[1]?arguments[1]:{},t=arguments.length>2&&void 0!==arguments[2]&&arguments[2];return(!(arguments.length>3&&void 0!==arguments[3])||arguments[3])&&l.Toast.loading({mask:!0,message:"加载中..."}),new f.a(function(a,o){b.a.get(e,{params:n}).then(function(e){l.Toast.clear(),200==e.code||0==e.code?(t&&k(e.msg),a(e)):300==e.code?(k("当前登录账号已过期，请重新登录"),setTimeout(function(){c.push({name:"phoneLogin",params:{hasLogin:!0}})},400),a(!1)):(Object(l.Toast)(e.msg),a(!1))},function(e){l.Toast.clear(),Object(l.Toast)(e.message),o(e)})})},post:function(e){var n=arguments.length>1&&void 0!==arguments[1]?arguments[1]:{},t=arguments.length>2&&void 0!==arguments[2]&&arguments[2];return(!(arguments.length>3&&void 0!==arguments[3])||arguments[3])&&l.Toast.loading({mask:!0,message:"加载中..."}),new f.a(function(a,o){b.a.post(e,y.a.stringify(n)).then(function(e){l.Toast.clear(),200==e.code||0==e.code?(t&&k(e.msg),a(e)):300==e.code?(k("当前登录账号已过期，请重新登录"),setTimeout(function(){c.push({name:"accountLogin",params:{hasLogin:!0}})},400),a(e)):(k(e.msg),a(!1))},function(e){l.Toast.clear(),k(e.message),o(e)})})},filePost:function(e){var n=arguments.length>1&&void 0!==arguments[1]?arguments[1]:{},t=arguments.length>2&&void 0!==arguments[2]&&arguments[2];(!(arguments.length>3&&void 0!==arguments[3])||arguments[3])&&l.Toast.loading({mask:!0,message:"加载中..."});var a={headers:{"Content-Type":"multipart/form-data"}};return new f.a(function(o,r){b.a.post(e,n,a).then(function(e){l.Toast.clear(),200==e.code||0==e.code?(t&&k(e.msg),o(e)):300==e.code?(k("当前登录账号已过期，请重新登录"),setTimeout(function(){c.push({name:"accountLogin",params:{hasLogin:!0}})},400)):(k(e.msg),o(!1))},function(e){l.Toast.clear(),k(e.message),r(e)})})}},T=t("BseR");o.a.config.productionTip=!1,o.a.use(m.a),o.a.prototype.$Axios=P,o.a.prototype.$Storage=v.a,o.a.prototype.$Utils=T.a,o.a.prototype.$Config=d;var x=new o.a;o.a.prototype.$Bus=x,o.a.mixin(p.a),c.beforeEach(function(e,n,t){(!e.meta.needLogin||v.a.get("token")||(T.a.toast("您还未登录，请先登录"),setTimeout(function(){c.push({name:"phoneLogin",params:{hasLogin:!0}})},400),0))&&(window.scrollTo(0,0),t())}),c.afterEach(function(e){var n=document.getElementById("app");"phoneLogin"==e.name||"accountLogin"==e.name||"register"==e.name||"niShen"==e.name?(n.style.backgroundColor="#fff",n.style.overflow="hidden"):n.removeAttribute("style")}),new o.a({el:"#app",router:c,components:{App:i},template:"<App/>"})},OMN4:function(e,n){e.exports=axios},lRwf:function(e,n){e.exports=Vue},ohH5:function(e,n,t){"use strict";var a=t("mvHQ"),o=t.n(a),r=function(){var e="mystorage",n=window.localStorage;if(!window.localStorage)return alert("浏览器支持localstorage"),!1;return{set:function(t,a){var r=n.getItem(e);return r||(this.init(),r=n.getItem(e)),(r=JSON.parse(r)).data[t]=a,n.setItem(e,o()(r)),r.data},get:function(t){var a=n.getItem(e);return!!a&&(a=JSON.parse(a)).data[t]},remove:function(t){var a=n.getItem(e);return!!a&&(delete(a=JSON.parse(a)).data[t],n.setItem(e,o()(a)),a.data)},init:function(){n.setItem(e,'{"data":{}}')},clear:function(){n.removeItem(e)}}}();n.a=r},pRNm:function(e,n){e.exports=VueRouter},qCxf:function(e,n,t){"use strict";var a=t("Xxa5"),o=t.n(a),r=t("exGp"),i=t.n(r),u=t("ohH5"),s=t("BseR"),c={data:function(){return{}},methods:{checkPhone:function(e){return e?!!/^1[3-9]\d{9}$/.test(e)||(s.a.toast("手机号格式不正确"),!1):(s.a.toast("手机号不能为空"),!1)},checkPassword:function(e){return e?!!/^[a-zA-Z0-9]{6,12}$/.test(e)||(s.a.toast("密码格式不正确"),!1):(s.a.toast("密码不能为空"),!1)},checkSmsCode:function(e){return e?!!/^\d{6}$/.test(e)||(s.a.toast("验证码不正确"),!1):(s.a.toast("验证码不能为空"),!1)},checkMail:function(e){return e?!!/^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/.test(e)||(s.a.toast("邮箱格式不正确"),!1):(s.a.toast("邮箱不能为空"),!1)},checkFile:function(e){return!!e||(s.a.toast("请先上传头像"),!1)}}};n.a={mixins:[c],data:function(){return{codeText:"获取验证码",time:60}},methods:{checkLogin:function(){var e=this;return!!u.a.get("token")||(s.a.toast("您还未登录，请先登录"),setTimeout(function(){e.$router.push({name:"phoneLogin",params:{hasLogin:!0}})},400),!1)},getSmsCode:function(e){var n=this,t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:"phone";return i()(o.a.mark(function a(){var r,i;return o.a.wrap(function(a){for(;;)switch(a.prev=a.next){case 0:if(n.checkPhone(n[e][t])){a.next=2;break}return a.abrupt("return");case 2:r="",a.t0=e,a.next="register"===a.t0?6:"phoneInfo"===a.t0?8:10;break;case 6:return r="/auth/sms/"+n[e][t],a.abrupt("break",11);case 8:return r="/auth/login/code/"+n[e][t],a.abrupt("break",11);case 10:return a.abrupt("break",11);case 11:return a.next=13,n.$Axios.post(r,{});case 13:a.sent&&(s.a.toast("验证码已发送"),n.time--,n.codeText="剩余"+n.time+"s",i=setInterval(function(){n.time<=1?(n.time=60,n.codeText="重新获取",clearInterval(i)):(n.time--,n.codeText="剩余"+n.time+"s")},1e3));case 15:case"end":return a.stop()}},a,n)}))()}}}},xcSH:function(e,n){e.exports=vant}},["NHnr"]);