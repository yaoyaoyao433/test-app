package com.sankuai.waimai.business.im.common.plugin.smartreply;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.api.WaimaiIMService;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.xm.base.util.ad;
import com.sankuai.xm.imui.common.panel.SendPanel;
import com.sankuai.xm.imui.common.panel.plugin.Plugin;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SmartReplyPlugin extends Plugin {
    public static ChangeQuickRedirect a;
    private e b;
    private d c;
    private boolean d;

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public int getPluginIcon() {
        return R.drawable.wm_im_xm_sdk_chat_smartreplay_plugin_btn;
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    @NonNull
    public CharSequence getPluginName() {
        return "";
    }

    public SmartReplyPlugin(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f08f4ad546d344b05ba3bdee5eace31d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f08f4ad546d344b05ba3bdee5eace31d");
            return;
        }
        this.d = false;
        k();
    }

    public SmartReplyPlugin(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3395f7a8109f0526c7579ef35594c4e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3395f7a8109f0526c7579ef35594c4e");
            return;
        }
        this.d = false;
        k();
    }

    public SmartReplyPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8318b763a2ad7adb4104514365086e8e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8318b763a2ad7adb4104514365086e8e");
            return;
        }
        this.d = false;
        k();
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f23b19f34c530d14966500236d2784da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f23b19f34c530d14966500236d2784da");
            return;
        }
        this.b = new e(getContext());
        this.b.setSmartReplyAction(new b() { // from class: com.sankuai.waimai.business.im.common.plugin.smartreply.SmartReplyPlugin.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.im.common.plugin.smartreply.b
            public final void a(final int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50e87ae924cfa36f1a23bf652a87ddcd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50e87ae924cfa36f1a23bf652a87ddcd");
                    return;
                }
                final SmartReplyPlugin smartReplyPlugin = SmartReplyPlugin.this;
                Object[] objArr3 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect3 = SmartReplyPlugin.a;
                if (PatchProxy.isSupport(objArr3, smartReplyPlugin, changeQuickRedirect3, false, "713daecc10fd70a3349be174845a6052", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, smartReplyPlugin, changeQuickRedirect3, false, "713daecc10fd70a3349be174845a6052");
                    return;
                }
                rx.d<BaseResponse> addCustomReply = ((WaimaiIMService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WaimaiIMService.class)).addCustomReply(com.sankuai.waimai.business.im.utils.c.b(i), str);
                b.AbstractC1042b<BaseResponse> abstractC1042b = new b.AbstractC1042b<BaseResponse>() { // from class: com.sankuai.waimai.business.im.common.plugin.smartreply.SmartReplyPlugin.2
                    public static ChangeQuickRedirect a;

                    @Override // rx.e
                    public final /* synthetic */ void onNext(Object obj) {
                        BaseResponse baseResponse = (BaseResponse) obj;
                        Object[] objArr4 = {baseResponse};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4325f5c6035585232e0ef33d3dde6f54", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4325f5c6035585232e0ef33d3dde6f54");
                        } else if (baseResponse == null || baseResponse.code != 0) {
                            if (baseResponse != null && !TextUtils.isEmpty(baseResponse.msg)) {
                                ad.a(SmartReplyPlugin.this.getContext(), baseResponse.msg);
                            } else {
                                ad.a(SmartReplyPlugin.this.getContext(), (int) R.string.wm_im_error_response);
                            }
                        } else {
                            SmartReplyPlugin.this.a(i, true);
                        }
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                        Object[] objArr4 = {th};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4ea22983e4bf159f37af222c94c496ee", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4ea22983e4bf159f37af222c94c496ee");
                        } else {
                            ad.a(SmartReplyPlugin.this.getContext(), (int) R.string.wm_im_net_error_retry_later);
                        }
                    }
                };
                com.sankuai.waimai.platform.capacity.network.retrofit.b.a(addCustomReply, abstractC1042b, smartReplyPlugin.getClass().getSimpleName() + System.currentTimeMillis());
            }

            @Override // com.sankuai.waimai.business.im.common.plugin.smartreply.b
            public final void a(final int i, long j) {
                Object[] objArr2 = {Integer.valueOf(i), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bff128855a227b8a78eeb1b8abd6930c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bff128855a227b8a78eeb1b8abd6930c");
                    return;
                }
                final SmartReplyPlugin smartReplyPlugin = SmartReplyPlugin.this;
                Object[] objArr3 = {Integer.valueOf(i), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = SmartReplyPlugin.a;
                if (PatchProxy.isSupport(objArr3, smartReplyPlugin, changeQuickRedirect3, false, "faa660c12f7969788a49435d1f68a400", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, smartReplyPlugin, changeQuickRedirect3, false, "faa660c12f7969788a49435d1f68a400");
                    return;
                }
                rx.d<BaseResponse> deleteCustomReply = ((WaimaiIMService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WaimaiIMService.class)).deleteCustomReply(j);
                b.AbstractC1042b<BaseResponse> abstractC1042b = new b.AbstractC1042b<BaseResponse>() { // from class: com.sankuai.waimai.business.im.common.plugin.smartreply.SmartReplyPlugin.3
                    public static ChangeQuickRedirect a;

                    @Override // rx.e
                    public final /* synthetic */ void onNext(Object obj) {
                        BaseResponse baseResponse = (BaseResponse) obj;
                        Object[] objArr4 = {baseResponse};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "58d8de9a108c552e109c9b4fb206a4c9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "58d8de9a108c552e109c9b4fb206a4c9");
                        } else if (baseResponse == null || baseResponse.code != 0) {
                            if (baseResponse != null && !TextUtils.isEmpty(baseResponse.msg)) {
                                ad.a(SmartReplyPlugin.this.getContext(), baseResponse.msg);
                            } else {
                                ad.a(SmartReplyPlugin.this.getContext(), (int) R.string.wm_im_error_response);
                            }
                        } else {
                            SmartReplyPlugin.this.a(i);
                        }
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                        Object[] objArr4 = {th};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a6b27baae4eeab3dde4f6fef190e48d6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a6b27baae4eeab3dde4f6fef190e48d6");
                        } else {
                            ad.a(SmartReplyPlugin.this.getContext(), (int) R.string.wm_im_net_error_retry_later);
                        }
                    }
                };
                com.sankuai.waimai.platform.capacity.network.retrofit.b.a(deleteCustomReply, abstractC1042b, smartReplyPlugin.getClass().getSimpleName() + System.currentTimeMillis());
            }
        });
        setPluginClickClosable(true);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d393b7bfd13fe7cd136a8344ae5680d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d393b7bfd13fe7cd136a8344ae5680d6");
        } else {
            a(i, false);
        }
    }

    public final void a(int i, final boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "199f946efb598aebd3e11e7a46cebd3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "199f946efb598aebd3e11e7a46cebd3f");
            return;
        }
        rx.d<BaseResponse<com.sankuai.waimai.business.im.common.model.c>> customReplyList = ((WaimaiIMService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WaimaiIMService.class)).getCustomReplyList(com.sankuai.waimai.business.im.utils.c.b(i));
        b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.im.common.model.c>> abstractC1042b = new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.im.common.model.c>>() { // from class: com.sankuai.waimai.business.im.common.plugin.smartreply.SmartReplyPlugin.4
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26fb6b803ba06ce55e98e6d356ab8b73", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26fb6b803ba06ce55e98e6d356ab8b73");
                } else if (baseResponse != null && baseResponse.code == 0) {
                    SmartReplyPlugin.this.d = false;
                    if (SmartReplyPlugin.this.c != null) {
                        SmartReplyPlugin.this.c.d = ((com.sankuai.waimai.business.im.common.model.c) baseResponse.data).a;
                    }
                    SmartReplyPlugin.this.b.setCustomPhrases(((com.sankuai.waimai.business.im.common.model.c) baseResponse.data).a);
                    SmartReplyPlugin.this.b.a();
                    if (z) {
                        e eVar = SmartReplyPlugin.this.b;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = e.a;
                        if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "58c62a45493c508075c956b32d3435fc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "58c62a45493c508075c956b32d3435fc");
                        } else if (eVar.h != null) {
                            eVar.h.smoothScrollToPosition(0);
                        }
                    }
                } else if (baseResponse != null && !TextUtils.isEmpty(baseResponse.msg)) {
                    ad.a(SmartReplyPlugin.this.getContext(), baseResponse.msg);
                } else {
                    ad.a(SmartReplyPlugin.this.getContext(), (int) R.string.wm_im_error_response);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1cf60cec42a4a205c8bbca638692c271", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1cf60cec42a4a205c8bbca638692c271");
                } else if (SmartReplyPlugin.this.b == null || SmartReplyPlugin.this.b.getCustomPhrases() != null) {
                } else {
                    SmartReplyPlugin.this.d = true;
                }
            }
        };
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(customReplyList, abstractC1042b, getClass().getSimpleName() + System.currentTimeMillis());
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "042c1e08ed5a13a780cce0727fde251c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "042c1e08ed5a13a780cce0727fde251c");
        } else {
            b(0);
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void a(SendPanel sendPanel) {
        Object[] objArr = {sendPanel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ba11f6dc6035d0c191ad5c899486f45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ba11f6dc6035d0c191ad5c899486f45");
        } else {
            super.a(sendPanel);
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.b;
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f69abfb2e961ede4c78c8186ef3de45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f69abfb2e961ede4c78c8186ef3de45");
            return;
        }
        b(1);
        if (this.c == null) {
            return;
        }
        this.b.setIMType(this.c.e);
        this.b.setSystemPhrases(this.c.c);
        this.b.setCustomPhrases(this.c.d);
        this.b.setMaxCustomCount(this.c.f);
        this.b.setCustomHint(this.c.h);
        this.b.setMaxCustomContentLength(this.c.g);
        this.b.setPhfLabBuilder(this.c.i);
        this.b.a();
        if (this.d) {
            a(this.c.e);
        }
    }

    public void setConfigInfo(@Nullable d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fb76b9bef040810f538564c20bf3210", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fb76b9bef040810f538564c20bf3210");
            return;
        }
        this.c = dVar;
        if (dVar == null) {
            return;
        }
        setDefaultFocused(dVar.b);
    }
}
