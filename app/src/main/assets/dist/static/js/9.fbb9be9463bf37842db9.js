webpackJsonp([9],{Cah1:function(t,s,a){"use strict";Object.defineProperty(s,"__esModule",{value:!0});var e=a("teIl"),i=a("Y1D9"),n=a("xcSH"),c={components:{Header:e.a,RefreshAndLoad:i.a},data:function(){return{question:"",money:100}},methods:{toOther:function(t){this.$router.push({name:t})},tiXian:function(){n.Dialog.confirm({message:"您确定要提现吗？",className:"confirm",confirmButtonText:"确定"}).then(function(){}).catch(function(){})},duiHuan:function(){n.Dialog.confirm({message:"您确定要兑换成法币吗？",className:"confirm",confirmButtonText:"确定"}).then(function(){}).catch(function(){})}}},l={render:function(){var t=this.$createElement,s=this._self._c||t;return s("section",{staticClass:"pb10 content",attrs:{id:"index"}},[s("Header",{attrs:{leftType:2,centerType:1,title:"法币充值",showRight:!1}}),this._v(" "),this._m(0),this._v(" "),this._m(1)],1)},staticRenderFns:[function(){var t=this,s=t.$createElement,a=t._self._c||s;return a("div",{staticClass:"chongzhi mlr20 pt20"},[a("p",{staticClass:"text-grey fts16 mb20"},[t._v("充值金额")]),t._v(" "),a("ul",{staticClass:"flex chongzhi-list wrap"},[a("li",{staticClass:"mb15"},[a("div",{staticClass:"chong-money active"},[t._v("￥20")])]),t._v(" "),a("li",{staticClass:"mb15"},[a("div",{staticClass:"chong-money"},[t._v("￥100")])]),t._v(" "),a("li",{staticClass:"mb15"},[a("div",{staticClass:"chong-money"},[t._v("￥500")])]),t._v(" "),a("li",{staticClass:"mb15"},[a("div",{staticClass:"chong-money"},[t._v("￥800")])])])])},function(){var t=this,s=t.$createElement,e=t._self._c||s;return e("div",{staticClass:"chongzhi mlr20"},[e("p",{staticClass:"text-grey fts16 mtb20"},[t._v("支付方式")]),t._v(" "),e("ul",{staticClass:"flex chongzhi-list wrap"},[e("li",{staticClass:"mb15"},[e("div",{staticClass:"chong-money active"},[e("img",{staticClass:"block margin-auto",attrs:{src:a("cHsQ"),alt:""}}),t._v(" "),e("span",{staticClass:"text-center text-blue"},[t._v("支付宝")])])]),t._v(" "),e("li",{staticClass:"mb15"},[e("div",{staticClass:"chong-money"},[e("img",{staticClass:"block margin-auto",attrs:{src:a("y+Fu"),alt:""}}),t._v(" "),e("span",{staticClass:"text-center text-blue"},[t._v("微信支付")])])])]),t._v(" "),e("div",{staticClass:"append-btns flex justify-around mt80"},[e("button",{staticClass:"append-btn active fts14"},[t._v("下一步")])])])}]};var o=a("VU/8")(c,l,!1,function(t){a("EBV6")},"data-v-2db37d9c",null);s.default=o.exports},EBV6:function(t,s){},"y+Fu":function(t,s){t.exports="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABQAAAASCAMAAABsDg4iAAAANlBMVEVHcExhkOhhkOlilO1hkOlgkOphkOlhkOlhkOlhkOlhkOlhkephkOlhkephkelgkOphkOlhkOiScIqLAAAAEXRSTlMAIooS6TLV9N65V0SYbHxgpSKMkkYAAACgSURBVBjTZZDrEsUQDIRdQgQtef+XPevWdubsj0x82CzGQLkn5liDeRWibok/rLA+SnYxT6pMk4yzCzq0waJEc6OWCYehG0vOglon/DhGd11twnQQtTsimBuz6hmcaTUM27DvN1IeLbbwiGv7qWa01a5cI5R2jKYRGWkIUFTShM9ImAo8vL1f2LHez32ysX0/y57PKuarJimJo2z+5Yv5AQUtDPPebYrRAAAAAElFTkSuQmCC"}});