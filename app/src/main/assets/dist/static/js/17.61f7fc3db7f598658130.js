webpackJsonp([17],{"+pge":function(t,e,s){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var a=s("Xxa5"),r=s.n(a),o=s("exGp"),n=s.n(o),i=s("U6Om"),l=s("teIl"),c=s("7/Lq"),f={components:{Header:l.a,ZiXunStep:i.a,PayModal:c.a},data:function(){return{question:"",showModal:!1,orderInfo:{},orderNo:""}},created:function(){this.orderNo=this.$route.params.orderNo||"",this.getOrderInfo()},methods:{getOrderInfo:function(){var t=this;return n()(r.a.mark(function e(){var s;return r.a.wrap(function(e){for(;;)switch(e.prev=e.next){case 0:if(t.checkLogin()){e.next=2;break}return e.abrupt("return");case 2:return e.next=4,t.$Axios.post("/consult/detail/"+t.orderNo);case 4:(s=e.sent).obj&&(t.orderInfo=s.obj);case 6:case"end":return e.stop()}},e,t)}))()},showPay:function(){this.checkLogin()&&(this.showModal=!0)},getPayInfo:function(t){console.log(t)}}},d={render:function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("section",{staticClass:"content",attrs:{id:"ziXun"}},[s("Header",{attrs:{leftType:2,centerType:1,title:"在线咨询"}}),t._v(" "),s("ZiXunStep",{attrs:{step:3}}),t._v(" "),s("div",{staticClass:"zixun-box mlr10 radius5"},[s("div",{staticClass:"plr10 ptb10 mb20 bg-white"},[s("h4",{staticClass:"text-grey fts16"},[t._v("订单详情")]),t._v(" "),s("div",{staticClass:"cell-item flex justify-between ptb10"},[s("span",{staticClass:"text-light fts14"},[t._v("订单编号")]),t._v(" "),s("span",{staticClass:"text-grey fts14 overflow-1"},[t._v(t._s(t.orderInfo.orderNo))])]),t._v(" "),s("div",{staticClass:"cell-item flex justify-between ptb10"},[s("span",{staticClass:"text-light fts14"},[t._v("创建时间")]),t._v(" "),s("span",{staticClass:"text-grey fts14 overflow-1"},[t._v(t._s(t.orderInfo.orderDate))])]),t._v(" "),s("div",{staticClass:"cell-item flex justify-between ptb10"},[s("span",{staticClass:"text-light fts14"},[t._v("订单类型")]),t._v(" "),s("span",{staticClass:"text-grey fts14 overflow-1"},[t._v(t._s(t.orderInfo.orderType))])]),t._v(" "),s("div",{staticClass:"cell-item flex justify-between ptb10"},[s("span",{staticClass:"text-light fts14"},[t._v("订单金额")]),t._v(" "),s("span",{staticClass:"text-grey fts14 overflow-1"},[t._v(" ￥"+t._s(t.orderInfo.amount))])])]),t._v(" "),s("div",{staticClass:"zixun-ques bg-white plr10 pb20"},[s("h4",{staticClass:"text-grey fts16 ptb15"},[t._v("咨询问题")]),t._v(" "),s("van-field",{staticClass:"textarea-form",attrs:{disabled:"",type:"textarea",rows:"5",autosize:""},model:{value:t.orderInfo.remark,callback:function(e){t.$set(t.orderInfo,"remark",e)},expression:"orderInfo.remark"}})],1)]),t._v(" "),s("div",{staticClass:"mlr10 mtb30"},[s("button",{staticClass:"grey-bg active wd100 create-btn",on:{click:t.showPay}},[t._v("立即付款")])]),t._v(" "),s("PayModal",{attrs:{payModal:t.showModal},on:{"update:payModal":function(e){t.showModal=e},"update:pay-modal":function(e){t.showModal=e},payInfo:t.getPayInfo}})],1)},staticRenderFns:[]};var u=s("VU/8")(f,d,!1,function(t){s("w4vu")},"data-v-a9fe086e",null);e.default=u.exports},w4vu:function(t,e){}});