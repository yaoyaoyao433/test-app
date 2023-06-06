package com.sankuai.xm.imui.common.panel.plugin;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.e;
import com.meituan.android.privacy.interfaces.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.ab;
import com.sankuai.xm.base.util.ad;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.VideoMessage;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.common.util.l;
import com.sankuai.xm.integration.mediapicker.MediaResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class PhotoPlugin extends Plugin {
    public static ChangeQuickRedirect c;
    public boolean d;

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public int getPluginIcon() {
        return R.drawable.xm_sdk_vd_ic_picture;
    }

    public PhotoPlugin(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a72c965ff8814ec021284edd2ce6d56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a72c965ff8814ec021284edd2ce6d56");
        }
    }

    private PhotoPlugin(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d8188942d7b6f9ca65507505c72a36d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d8188942d7b6f9ca65507505c72a36d");
        }
    }

    public PhotoPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e78a41be8e61b4a2912cb5742b27fb8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e78a41be8e61b4a2912cb5742b27fb8");
        } else {
            this.d = false;
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f225445f58f092710ae787060998f39", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f225445f58f092710ae787060998f39");
            return;
        }
        e createPermissionGuard = Privacy.createPermissionGuard();
        if (createPermissionGuard == null) {
            ad.a(getContext(), (int) R.string.xm_sdk_perm_check_fail);
            d.d("PhotoPlugin::onOpen: perm is null", new Object[0]);
            return;
        }
        int a = createPermissionGuard.a(getContext(), PermissionGuard.PERMISSION_STORAGE_READ, "jcyf-e4b399808a333f25");
        d.b("PhotoPlugin::onOpen::perm code : %s", Integer.valueOf(a));
        if (a > 0) {
            k();
        } else {
            createPermissionGuard.a(getActivity(), PermissionGuard.PERMISSION_STORAGE_READ, "jcyf-e4b399808a333f25", (com.meituan.android.privacy.interfaces.d) new g() { // from class: com.sankuai.xm.imui.common.panel.plugin.PhotoPlugin.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str, int i) {
                    Object[] objArr2 = {str, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "36df9b1c2fb02bf85fd1c86cc6ccd11c", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "36df9b1c2fb02bf85fd1c86cc6ccd11c");
                    } else if (i > 0) {
                        PhotoPlugin.this.k();
                    } else {
                        d.c("PhotoPlugin::onOpen::onResult: %s", Integer.valueOf(i));
                        if (PhotoPlugin.this.c(262144)) {
                            return;
                        }
                        l.a(PhotoPlugin.this.getContext(), R.string.xm_sdk_perm_storage);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public String getPluginName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4874aa07e8b350642d774ae3fdfea1a8", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4874aa07e8b350642d774ae3fdfea1a8") : getResources().getString(R.string.xm_sdk_image);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1736d807868524bdda647fe538d1afe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1736d807868524bdda647fe538d1afe");
        } else {
            com.sankuai.xm.integration.mediapicker.b.a(getContext()).a(9).b((this.d ? 2 : 0) | 1).a(new Callback<List<MediaResult>>() { // from class: com.sankuai.xm.imui.common.panel.plugin.PhotoPlugin.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(List<MediaResult> list) {
                    String a2;
                    List<MediaResult> list2 = list;
                    int i = 1;
                    Object[] objArr2 = {list2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "544546530e4217050e68b282a9e2a68d", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "544546530e4217050e68b282a9e2a68d");
                    } else if (!com.sankuai.xm.base.util.b.a(list2)) {
                        ArrayList arrayList = new ArrayList(list2.size());
                        for (MediaResult mediaResult : list2) {
                            if (mediaResult != null && mediaResult.b != null && (a2 = k.a(PhotoPlugin.this.getContext(), mediaResult.b)) != null) {
                                d.b("PhotoPlugin::doPickMedia, path = " + a2, new Object[0]);
                                if (mediaResult.c == i) {
                                    arrayList.add(com.sankuai.xm.imui.common.util.c.a(a2, mediaResult.d));
                                } else {
                                    com.sankuai.xm.im.message.api.e eVar = (com.sankuai.xm.im.message.api.e) m.a(com.sankuai.xm.im.message.api.e.class);
                                    if (eVar != null) {
                                        Map<String, String> a3 = eVar.a(a2);
                                        VideoMessage a4 = com.sankuai.xm.imui.common.util.c.a(a2, "", System.currentTimeMillis(), (int) ab.a(a3.get("duration"), 0L), (short) ab.a(a3.get("width"), 0L), (short) ab.a(a3.get("height"), 0L), 0L);
                                        a4.setOperationType(5);
                                        arrayList.add(a4);
                                        i = 1;
                                    }
                                }
                            }
                        }
                        IMUIManager.a().a((List<IMMessage>) arrayList, false);
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee53d38463e6c60163201bd80cf17acb", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee53d38463e6c60163201bd80cf17acb");
                        return;
                    }
                    d.d("PhotoPlugin.doPickMedia, code = %d, info = %s", Integer.valueOf(i), str);
                    ad.a(PhotoPlugin.this.getContext(), (int) R.string.xm_sdk_photo_gallery_open_failed);
                }
            });
        }
    }
}
