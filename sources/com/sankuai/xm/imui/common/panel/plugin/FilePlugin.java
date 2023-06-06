package com.sankuai.xm.imui.common.panel.plugin;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.constraint.R;
import android.util.AttributeSet;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.e;
import com.meituan.android.privacy.interfaces.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.base.util.ad;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.base.util.n;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.common.util.l;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class FilePlugin extends Plugin {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public int getPluginIcon() {
        return R.drawable.xm_sdk_vd_ic_folder;
    }

    public FilePlugin(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeb9ff6e05f3565ca7c33a6a4d42161a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeb9ff6e05f3565ca7c33a6a4d42161a");
        }
    }

    private FilePlugin(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b7db92d181bdefbb055b13b71331801", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b7db92d181bdefbb055b13b71331801");
        }
    }

    public FilePlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "542ff4d66b0f416f5da6a146e1ca6ea8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "542ff4d66b0f416f5da6a146e1ca6ea8");
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49b649e929b0213e2b50a727a376028b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49b649e929b0213e2b50a727a376028b");
            return;
        }
        e createPermissionGuard = Privacy.createPermissionGuard();
        if (createPermissionGuard == null) {
            ad.a(getContext(), (int) R.string.xm_sdk_perm_check_fail);
            d.d("CameraPlugin::onOpen: perm is null", new Object[0]);
            return;
        }
        int a2 = createPermissionGuard.a(getContext(), PermissionGuard.PERMISSION_STORAGE_READ, "jcyf-e4b399808a333f25");
        d.b("CameraPlugin::onOpen::perm code : %s", Integer.valueOf(a2));
        if (a2 > 0) {
            k();
        } else {
            createPermissionGuard.a(getActivity(), PermissionGuard.PERMISSION_STORAGE_READ, "jcyf-e4b399808a333f25", (com.meituan.android.privacy.interfaces.d) new g() { // from class: com.sankuai.xm.imui.common.panel.plugin.FilePlugin.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str, int i) {
                    Object[] objArr2 = {str, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fbd5e2d8c4276ef88536881bd58b4fbf", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fbd5e2d8c4276ef88536881bd58b4fbf");
                    } else if (i > 0) {
                        FilePlugin.this.k();
                    } else {
                        d.c("CameraPlugin::onOpen::onResult: %s", Integer.valueOf(i));
                        if (FilePlugin.this.c(262144)) {
                            return;
                        }
                        l.a(FilePlugin.this.getContext(), R.string.xm_sdk_perm_storage);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public String getPluginName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90d6939405cfb3a08b2d4f0e1baed646", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90d6939405cfb3a08b2d4f0e1baed646") : getResources().getString(R.string.xm_sdk_app_plugin_file);
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin, com.sankuai.xm.imui.base.BaseActivity.a
    public void onActivityResult(int i, int i2, Intent intent) {
        IMMessage a2;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0709f4d91d1784115071a0bf53782a56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0709f4d91d1784115071a0bf53782a56");
        } else if (i == 0 && i2 == -1) {
            Uri data = intent.getData();
            String a3 = k.a(getContext(), data);
            if (data == null || a3 == null || !k.o(a3)) {
                ad.a(getContext(), (int) R.string.xm_sdk_file_read_fail);
            } else if (k.p(a3) > 31457280) {
                ad.a(getContext(), (int) R.string.xm_sdk_session_msg_error_file_too_large);
            } else {
                if (Build.VERSION.SDK_INT > 29) {
                    try {
                        k.b(getContext()).a(data, 1);
                    } catch (Exception e) {
                        d.a(e);
                        ad.a(getContext(), (int) R.string.xm_sdk_file_permission_deny);
                        return;
                    }
                }
                String a4 = k.a(a3);
                if (n.g(a4)) {
                    a2 = com.sankuai.xm.imui.common.util.c.a(a3, false);
                } else {
                    a2 = com.sankuai.xm.imui.common.util.c.a(a3, k.n(a3), a4);
                }
                IMUIManager.a().a(a2, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f454791e48c0ecd792764816b16c3cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f454791e48c0ecd792764816b16c3cc");
            return;
        }
        Intent intent = new Intent();
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        if (Build.VERSION.SDK_INT < 19) {
            intent.setAction("android.intent.action.GET_CONTENT");
        } else {
            intent.setAction("android.intent.action.OPEN_DOCUMENT");
            intent.addFlags(65);
        }
        if (!ActivityUtils.a(getContext(), intent)) {
            ad.a(getContext(), (int) R.string.xm_sdk_file_open_browser_error);
        } else {
            a(intent, 0);
        }
    }
}
