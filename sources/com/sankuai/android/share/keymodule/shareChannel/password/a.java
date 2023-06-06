package com.sankuai.android.share.keymodule.shareChannel.password;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.nom.LyingkitKernel_share;
import com.meituan.android.nom.annotation.NomApiInterface;
import com.meituan.android.nom.annotation.NomServiceInterface;
import com.meituan.android.nom.lyingkit.LyingkitTraceBody;
import com.meituan.android.nom.lyingkit.LyingkitZone;
import com.meituan.passport.UserCenter;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.ShareActivity;
import com.sankuai.android.share.bean.ShareBaseBean;
import com.sankuai.android.share.common.ShareDialog;
import com.sankuai.android.share.common.bean.PasswordCallbackBean;
import com.sankuai.android.share.common.util.d;
import com.sankuai.android.share.constant.a;
import com.sankuai.android.share.interfaces.b;
import com.sankuai.android.share.interfaces.c;
import com.sankuai.android.share.keymodule.b;
import com.sankuai.android.share.keymodule.shareChannel.password.bean.PasswordBean;
import com.sankuai.android.share.keymodule.shareChannel.password.request.PasswordRetrofitService;
import com.sankuai.android.share.util.d;
import com.sankuai.android.share.util.e;
import com.sankuai.android.share.util.i;
import com.sankuai.android.share.util.j;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.f;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.HashMap;
/* compiled from: ProGuard */
@NomServiceInterface(componentName = "share", keyModuleName = "share", serviceName = "passwordService")
/* loaded from: classes3.dex */
public class a extends b {
    public static ChangeQuickRedirect a;
    private c b;

    @NomApiInterface(alias = "password")
    public void share(final LyingkitTraceBody lyingkitTraceBody, final Context context, b.a aVar, final ShareBaseBean shareBaseBean, c cVar) {
        Call<PasswordBean> password;
        Object[] objArr = {lyingkitTraceBody, context, aVar, shareBaseBean, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ea034715cedc4e52443fe905bbe1989", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ea034715cedc4e52443fe905bbe1989");
            return;
        }
        com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "0", "调用获取口令 Service 接口成功");
        if (context == null || shareBaseBean == null) {
            if (cVar != null) {
                cVar.a(aVar, c.a.FAILED);
            }
            d.a(context, aVar, shareBaseBean, a.EnumC0540a.Data);
            return;
        }
        this.b = cVar;
        User user = UserCenter.getInstance(context).getUser();
        final String string = TextUtils.isEmpty(shareBaseBean.getTitle()) ? context.getString(R.string.share_password_title) : shareBaseBean.getTitle();
        String valueOf = user == null ? null : String.valueOf(user.id);
        String str = user != null ? user.token : null;
        final String url = shareBaseBean.getPasswordUrl() == null ? shareBaseBean.getUrl() : shareBaseBean.getPasswordUrl();
        ShareDialog.a(context);
        com.sankuai.android.share.keymodule.shareChannel.password.request.a a2 = com.sankuai.android.share.keymodule.shareChannel.password.request.a.a(context);
        Object[] objArr2 = {shareBaseBean, aVar, string, url, valueOf, str};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.android.share.keymodule.shareChannel.password.request.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "3ed76a62156f6a2ba4c4052e35f87e2c", RobustBitConfig.DEFAULT_VALUE)) {
            password = (Call) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "3ed76a62156f6a2ba4c4052e35f87e2c");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("mtShareId", shareBaseBean.getAppshare());
            hashMap.put("title", string);
            hashMap.put("image", shareBaseBean.getImgUrl());
            hashMap.put("url", url);
            hashMap.put("cid", shareBaseBean.getCid());
            hashMap.put("biz", 1);
            if (!TextUtils.isEmpty(valueOf)) {
                hashMap.put(DeviceInfo.USER_ID, valueOf);
            }
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("token", str);
            }
            hashMap.put("pwTemplateKey", shareBaseBean.getPwTemplateKey());
            hashMap.put("pwTemplateIndex", Integer.valueOf(shareBaseBean.getPwTemplateIndex()));
            hashMap.put("btn", shareBaseBean.getPwConfigBtn());
            if (com.sankuai.android.share.common.util.a.c()) {
                hashMap.put("redirectShareId", j.a(a2.c, aVar, shareBaseBean));
            }
            password = ((PasswordRetrofitService) a2.b.a(PasswordRetrofitService.class)).getPassword(hashMap);
        }
        password.a(new f<PasswordBean>() { // from class: com.sankuai.android.share.keymodule.shareChannel.password.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onResponse(Call<PasswordBean> call, Response<PasswordBean> response) {
                Object[] objArr3 = {call, response};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ed1598a38bcd485cd4b4bfb21844d642", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ed1598a38bcd485cd4b4bfb21844d642");
                    return;
                }
                PasswordCallbackBean passwordCallbackBean = new PasswordCallbackBean(response, null);
                passwordCallbackBean.context = context;
                passwordCallbackBean.title = string;
                passwordCallbackBean.url = url;
                com.meituan.android.nom.lyingkit.b.a(new LyingkitZone("share", "5.23.49", lyingkitTraceBody, "0"), LyingkitKernel_share.SHARE_PASSWORDSERVICE_GETPASSWORDCALLBACK, Boolean.TRUE, passwordCallbackBean, shareBaseBean);
            }

            @Override // com.sankuai.meituan.retrofit2.f
            public final void onFailure(Call<PasswordBean> call, Throwable th) {
                Object[] objArr3 = {call, th};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1c2c34ebad9f0fed7a66d19a7968af4e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1c2c34ebad9f0fed7a66d19a7968af4e");
                    return;
                }
                PasswordCallbackBean passwordCallbackBean = new PasswordCallbackBean(null, th);
                passwordCallbackBean.context = context;
                passwordCallbackBean.title = string;
                passwordCallbackBean.url = url;
                com.meituan.android.nom.lyingkit.b.a(new LyingkitZone("share", "5.23.49", lyingkitTraceBody, "0"), LyingkitKernel_share.SHARE_PASSWORDSERVICE_GETPASSWORDCALLBACK, Boolean.FALSE, passwordCallbackBean, shareBaseBean);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(LyingkitTraceBody lyingkitTraceBody, Context context, ShareBaseBean shareBaseBean) {
        Object[] objArr = {lyingkitTraceBody, context, shareBaseBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03c734b99b263409dab03441029e4872", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03c734b99b263409dab03441029e4872");
            return;
        }
        if (context instanceof ShareActivity) {
            com.sankuai.android.share.a.a(context, (int) R.string.share_password_fail);
        } else if (context instanceof Activity) {
            com.sankuai.meituan.android.ui.widget.a.a((Activity) context, context.getText(R.string.share_password_fail), -1).a();
        }
        if (this.b != null && (this.b instanceof com.sankuai.android.share.interfaces.d)) {
            ((com.sankuai.android.share.interfaces.d) this.b).a(b.a.PASSWORD, c.a.FAILED, "");
        } else if (this.b != null) {
            this.b.a(b.a.PASSWORD, c.a.FAILED);
        }
        com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "1", "口令渠道分享失败---error: 生成口令失败");
    }

    @NomApiInterface(alias = "getAlertInfo")
    private boolean getAlertInfo(LyingkitTraceBody lyingkitTraceBody, com.sankuai.android.share.password.a aVar) {
        Object[] objArr = {lyingkitTraceBody, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a730d052ec93475c9444d098f228769c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a730d052ec93475c9444d098f228769c")).booleanValue();
        }
        com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "0", "调用获取口令弹窗 Service 接口成功");
        return aVar.a(lyingkitTraceBody);
    }

    @NomApiInterface(alias = "show")
    private void showPasswordAlert(LyingkitTraceBody lyingkitTraceBody, com.sankuai.android.share.password.a aVar) {
        Object[] objArr = {lyingkitTraceBody, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db8d882c5f1b3564d84a9261e7d9f523", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db8d882c5f1b3564d84a9261e7d9f523");
            return;
        }
        Object[] objArr2 = {lyingkitTraceBody};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.android.share.password.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "914a945537736bcf0aeff8460d364f46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "914a945537736bcf0aeff8460d364f46");
        } else if (aVar.e() == null || aVar.b == null) {
            aVar.a(lyingkitTraceBody, "1", "展示口令弹窗失败---error: context=null");
            com.sankuai.android.share.util.c.a("展示口令弹窗失败---error: context=null" + aVar.b);
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.android.share.password.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "07ceb5fb5b9666440806f5272cd8bd71", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "07ceb5fb5b9666440806f5272cd8bd71");
            } else {
                Activity e = aVar.e();
                if (e != null) {
                    aVar.d = View.inflate(e, R.layout.share_password_dialog, null);
                    ImageView imageView = (ImageView) aVar.d.findViewById(R.id.image);
                    if (aVar.g != null) {
                        imageView.setImageBitmap(aVar.g);
                    } else if (aVar.o != null) {
                        imageView.setImageDrawable(aVar.o);
                        aVar.o.start();
                    } else if (aVar.i != null) {
                        imageView.setImageDrawable(aVar.i);
                    } else {
                        Picasso.g(e).a(R.drawable.share_password_defalut_image).a(new e(e, com.sankuai.android.share.common.util.b.a(e, 10.0f), 0, e.a.TOP)).a(imageView);
                    }
                    ImageView imageView2 = (ImageView) aVar.d.findViewById(R.id.icon);
                    if (TextUtils.isEmpty(aVar.b.nickName)) {
                        if (aVar.j != null) {
                            imageView2.setImageDrawable(aVar.j);
                        } else {
                            imageView2.setImageResource(R.drawable.share_default_app_icon);
                        }
                        if (TextUtils.isEmpty(aVar.l)) {
                            ((TextView) aVar.d.findViewById(R.id.sub_title)).setText(R.string.share_password_sub_title);
                        } else {
                            ((TextView) aVar.d.findViewById(R.id.sub_title)).setText(aVar.l);
                        }
                    } else {
                        RequestCreator a2 = Picasso.g(e).d(aVar.b.userAvatar).a(com.sankuai.android.share.keymodule.shareChannel.password.view.a.b());
                        a2.g = R.drawable.share_default_icon;
                        a2.a(imageView2);
                        String str = aVar.b.nickName;
                        if (!TextUtils.isEmpty(str) && str.length() >= 8) {
                            str = str.substring(0, 8) + "...";
                        }
                        ((TextView) aVar.d.findViewById(R.id.nick_name)).setText(str);
                        ((TextView) aVar.d.findViewById(R.id.sub_title)).setText(R.string.share_password_share_with);
                    }
                    if (!TextUtils.isEmpty(aVar.b.title)) {
                        ((TextView) aVar.d.findViewById(R.id.title)).setText(aVar.b.title);
                    } else if (!TextUtils.isEmpty(aVar.k)) {
                        ((TextView) aVar.d.findViewById(R.id.title)).setText(aVar.k);
                    }
                    aVar.e = (TextView) aVar.d.findViewById(R.id.count_down);
                    Button button = (Button) aVar.d.findViewById(R.id.btn);
                    String str2 = aVar.b.btn;
                    if (!TextUtils.isEmpty(str2) && str2.length() >= 8) {
                        str2 = str2.substring(0, 8) + "...";
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        button.setText(str2);
                    } else {
                        button.setText(R.string.share_password_btn);
                    }
                    if (aVar.m != null) {
                        button.setBackground(aVar.m);
                    }
                    if (!TextUtils.isEmpty(aVar.n)) {
                        button.setTextColor(Color.parseColor(aVar.n));
                    }
                    button.setOnClickListener(aVar);
                    aVar.d.findViewById(R.id.cancel).setOnClickListener(aVar);
                }
            }
            Object[] objArr4 = {lyingkitTraceBody};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.android.share.password.a.a;
            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "35fb5f94c69bd33fe85b7f7b8137537e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "35fb5f94c69bd33fe85b7f7b8137537e");
            } else if (aVar.d == null) {
                aVar.a(lyingkitTraceBody, "1", "展示口令弹窗失败---error: 根view为空");
            } else {
                Activity e2 = aVar.e();
                if (e2 != null) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(e2);
                    builder.setView(aVar.d);
                    builder.setCancelable(true);
                    aVar.c = builder.create();
                    aVar.c.setOnShowListener(aVar);
                    aVar.c.show();
                    if (aVar.c.getWindow() != null) {
                        aVar.c.getWindow().setBackgroundDrawableResource(17170445);
                    }
                    if (Statistics.isInitialized()) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("pwd", aVar.f);
                        aVar.a(hashMap);
                        Statistics.getChannel("group").writeModelView(aVar.h, "b_group_ib4ehkpc_mv", hashMap, "c_sxr976a");
                    }
                    aVar.a("showDialog");
                }
            }
            aVar.a(lyingkitTraceBody, "0", "展示口令弹窗成功");
            com.sankuai.android.share.util.c.a("展示口令弹窗成功 " + aVar.b);
        }
    }

    @NomApiInterface(alias = "getPasswordCallBack")
    private void getPasswordCallBack(final LyingkitTraceBody lyingkitTraceBody, boolean z, PasswordCallbackBean passwordCallbackBean, final ShareBaseBean shareBaseBean) {
        String str;
        String message;
        String str2;
        Object[] objArr = {lyingkitTraceBody, Byte.valueOf(z ? (byte) 1 : (byte) 0), passwordCallbackBean, shareBaseBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3ba7e94f1a37bf5cdf2bc14e05b8e39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3ba7e94f1a37bf5cdf2bc14e05b8e39");
        } else if (passwordCallbackBean == null) {
        } else {
            if (z) {
                ShareDialog.b(passwordCallbackBean.context);
                if (passwordCallbackBean.response != null) {
                    PasswordBean passwordBean = (PasswordBean) passwordCallbackBean.response.e;
                    if (passwordBean != null && passwordBean.data != null && !TextUtils.isEmpty(passwordBean.data.groupPw)) {
                        com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "0", "生成口令成功---password:" + passwordBean.data.groupPw);
                        final Context context = passwordCallbackBean.context;
                        final String str3 = passwordBean.data.groupPw;
                        Object[] objArr2 = {lyingkitTraceBody, context, str3, shareBaseBean};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2fc3d4d43a44dfd55dfa88ebcbfb686", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2fc3d4d43a44dfd55dfa88ebcbfb686");
                        } else if (context != null) {
                            com.sankuai.android.share.util.c.a("shareByPasswordSuccess-口令获取成功");
                            com.sankuai.android.share.common.util.d.a(context, "com.meituan.share.channel.password", str3, "pt-38369168f01f3e91", new d.a() { // from class: com.sankuai.android.share.keymodule.shareChannel.password.a.2
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.android.share.common.util.d.a
                                public final void a() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b5083d4ff9ec73f18beae964d8f2dc74", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b5083d4ff9ec73f18beae964d8f2dc74");
                                        return;
                                    }
                                    com.sankuai.android.share.a.a(context, (int) R.string.share_password_success);
                                    if (Statistics.isInitialized()) {
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("pwd", str3);
                                        i.c("b_group_97rlzycu_mv", hashMap).a("c_group_9tox18yt").a();
                                    }
                                    if (a.this.b == null || !(a.this.b instanceof com.sankuai.android.share.interfaces.d)) {
                                        if (a.this.b != null) {
                                            a.this.b.a(b.a.PASSWORD, c.a.COMPLETE);
                                        }
                                    } else {
                                        ((com.sankuai.android.share.interfaces.d) a.this.b).a(b.a.PASSWORD, c.a.COMPLETE, str3);
                                    }
                                    LyingkitTraceBody lyingkitTraceBody2 = lyingkitTraceBody;
                                    com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody2, "0", "口令渠道分享成功---password: " + str3);
                                    com.sankuai.android.share.util.d.a(context, b.a.PASSWORD, shareBaseBean);
                                }

                                @Override // com.sankuai.android.share.common.util.d.a
                                public final void a(int i, Exception exc) {
                                    Object[] objArr3 = {Integer.valueOf(i), exc};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "786ecbea18573feed0aa65a1e83b47fe", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "786ecbea18573feed0aa65a1e83b47fe");
                                        return;
                                    }
                                    a.this.a(lyingkitTraceBody, context, shareBaseBean);
                                    com.sankuai.android.share.util.d.a(context, b.a.PASSWORD, shareBaseBean, a.EnumC0540a.FailedApplyPermission);
                                }
                            });
                        }
                        com.sankuai.meituan.skyeye.library.core.e.a().a("biz_share", "share_flow_password", "share_flow_password_success", null);
                        return;
                    }
                    String str4 = passwordCallbackBean.url;
                    if (passwordBean == null) {
                        str2 = "数据解析异常";
                    } else {
                        str2 = passwordBean.code + CommonConstant.Symbol.COLON + passwordBean.msg;
                    }
                    a(str4, str2);
                    return;
                }
                com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "1", "生成口令失败---title：" + passwordCallbackBean.title + " URLString：" + passwordCallbackBean.url + " error: 网络请求返回为空");
                a(lyingkitTraceBody, passwordCallbackBean.context, shareBaseBean);
                str = passwordCallbackBean.url;
                message = "网络异常";
            } else {
                if (passwordCallbackBean.t != null) {
                    com.sankuai.android.share.keymodule.a.a(lyingkitTraceBody, "1", "生成口令失败---title：" + passwordCallbackBean.title + " URLString：" + passwordCallbackBean.url + " error: " + passwordCallbackBean.t.getMessage());
                }
                ShareDialog.b(passwordCallbackBean.context);
                a(lyingkitTraceBody, passwordCallbackBean.context, shareBaseBean);
                str = passwordCallbackBean.url;
                message = passwordCallbackBean.t == null ? "网络异常" : passwordCallbackBean.t.getMessage();
            }
            a(str, message);
        }
    }

    private void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fdcdf3804ab4c6f3d551b58d67eb0c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fdcdf3804ab4c6f3d551b58d67eb0c9");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("msg", str2);
        hashMap.put("belong", com.meituan.android.base.share.b.a());
        com.sankuai.meituan.skyeye.library.core.e.a().a("biz_share", "share_flow_password", "share_flow_password_error", "获取团口令失败", hashMap);
    }
}
