package com.sankuai.xm.imui.common.panel.plugin;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.util.AttributeSet;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.g;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.ad;
import com.sankuai.xm.base.util.ae;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.base.util.n;
import com.sankuai.xm.base.util.v;
import com.sankuai.xm.base.util.y;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.DxFileProvider;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.common.util.l;
import com.sankuai.xm.integration.mediaeditor.IMediaEditor;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CameraPlugin extends Plugin {
    public static ChangeQuickRedirect c;
    private Handler a;
    private Uri b;

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public int getPluginIcon() {
        return R.drawable.xm_sdk_vd_ic_camera;
    }

    public static /* synthetic */ void a(CameraPlugin cameraPlugin) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, cameraPlugin, changeQuickRedirect, false, "dc6cfd725a2e41ed7d7f31ae4252e9ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, cameraPlugin, changeQuickRedirect, false, "dc6cfd725a2e41ed7d7f31ae4252e9ff");
        } else if (!cameraPlugin.getContext().getPackageManager().hasSystemFeature("android.hardware.camera.any")) {
            ad.a(cameraPlugin.getContext(), (int) R.string.xm_sdk_camera_no_set);
            d.b("CameraPlugin::invokeCamera::no camera.", new Object[0]);
        } else {
            cameraPlugin.b = cameraPlugin.k();
            if (cameraPlugin.b == null) {
                ad.a(cameraPlugin.getContext(), (int) R.string.xm_sdk_file_permission_deny);
                d.b("CameraPlugin::invokeCamera::no output uri.", new Object[0]);
                return;
            }
            d.b("CameraPlugin::invokeCamera::mPicUri = %s", cameraPlugin.b);
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", cameraPlugin.b);
            intent.addFlags(3);
            if (!ActivityUtils.a(cameraPlugin.getContext(), intent)) {
                ad.a(cameraPlugin.getContext(), (int) R.string.xm_sdk_camera_no_set);
                d.d("CameraPlugin::invokeCamera::camera activity is not resolvable.", new Object[0]);
                return;
            }
            try {
                cameraPlugin.a(intent, 0);
            } catch (Throwable th) {
                d.a(th);
                com.sankuai.xm.monitor.statistics.a.a("imui", "CameraPlugin::invokeCamera", th);
                ad.a(cameraPlugin.getContext(), (int) R.string.xm_sdk_camera_failed);
            }
        }
    }

    public CameraPlugin(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce89e034b50d637f1d1dc58896df4cf4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce89e034b50d637f1d1dc58896df4cf4");
        }
    }

    private CameraPlugin(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c7557abe4cdff07190fdcaeb553c651", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c7557abe4cdff07190fdcaeb553c651");
        }
    }

    public CameraPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "873dad0fdd60bd1282b4f1b0257b8cd8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "873dad0fdd60bd1282b4f1b0257b8cd8");
        } else {
            this.a = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.xm.imui.common.panel.plugin.CameraPlugin.1
                public static ChangeQuickRedirect a;

                @Override // android.os.Handler
                public final void handleMessage(@NonNull Message message) {
                    Object[] objArr2 = {message};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6e39923a8916e6b85d9809a905fabb3", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6e39923a8916e6b85d9809a905fabb3");
                    } else if (message.what == 1) {
                        CameraPlugin.this.a(message.arg1);
                    } else {
                        super.handleMessage(message);
                    }
                }
            };
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34e3bbc7b78304bb4b2c6fde08a972a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34e3bbc7b78304bb4b2c6fde08a972a4");
            return;
        }
        v.a a = v.a().a(PermissionGuard.PERMISSION_CAMERA, "jcyf-e4b399808a333f25", new ae() { // from class: com.sankuai.xm.imui.common.panel.plugin.CameraPlugin.4
            public static ChangeQuickRedirect b;
            private g d = j.a();

            @Override // com.sankuai.xm.base.util.ae
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a74421a82a2678597414eeea9be12b9d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a74421a82a2678597414eeea9be12b9d");
                    return;
                }
                d.c("CameraPlugin::onOpen::camera deny", new Object[0]);
                if (CameraPlugin.this.c(262144)) {
                    return;
                }
                l.a(CameraPlugin.this.getContext(), R.string.xm_sdk_perm_camera);
            }
        }).a(PermissionGuard.PERMISSION_STORAGE_WRITE, "jcyf-e4b399808a333f25", new ae() { // from class: com.sankuai.xm.imui.common.panel.plugin.CameraPlugin.3
            public static ChangeQuickRedirect b;
            private g d = j.a();

            @Override // com.sankuai.xm.base.util.ae
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "540b0ca77bd0b2621b89ea72a1533684", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "540b0ca77bd0b2621b89ea72a1533684");
                    return;
                }
                d.c("CameraPlugin::onOpen::sdcard deny", new Object[0]);
                if (CameraPlugin.this.c(262144)) {
                    return;
                }
                l.a(CameraPlugin.this.getContext(), R.string.xm_sdk_perm_storage);
            }
        });
        a.b = new ae() { // from class: com.sankuai.xm.imui.common.panel.plugin.CameraPlugin.2
            public static ChangeQuickRedirect b;
            private g d = j.a();

            @Override // com.sankuai.xm.base.util.ae
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc2e42bef190eddc4c6d62604dbf38e7", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc2e42bef190eddc4c6d62604dbf38e7");
                } else {
                    CameraPlugin.a(CameraPlugin.this);
                }
            }
        };
        a.a();
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public String getPluginName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b24568bb721335e50e920eb4e2d3d80", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b24568bb721335e50e920eb4e2d3d80") : getResources().getString(R.string.xm_sdk_app_plugin_camera);
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c86f3d0d55c6f480f7564ae0365bcd22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c86f3d0d55c6f480f7564ae0365bcd22");
            return;
        }
        this.a.removeCallbacksAndMessages(null);
        super.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6d514fb3c32ea7b2b5bd8423fac91e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6d514fb3c32ea7b2b5bd8423fac91e3");
            return;
        }
        String a = k.a(getContext(), this.b);
        boolean z = a != null && k.o(a) && k.p(a) > 0;
        d.b("CameraPlugin::handlePictureResult::path:%s, validPic:%s, size: %s, retryCountRest:%s", a, Boolean.valueOf(z), Long.valueOf(k.p(a)), Integer.valueOf(i));
        if (!z) {
            if (a != null && i > 0) {
                a = y.a(getContext(), this.b);
                if (ac.a(a) || !k.o(a) || k.p(a) <= 0) {
                    Message obtain = Message.obtain(this.a, 1);
                    obtain.arg1 = i - 1;
                    this.a.sendMessageDelayed(obtain, 500L);
                    return;
                }
                d.b("CameraPlugin::handlePictureResult::use absolute path: %s.", a);
            } else {
                ad.a(getContext(), (int) R.string.xm_sdk_camera_read_pic_failed);
                d.b("CameraPlugin::handlePictureResult::read pic failed.", new Object[0]);
                return;
            }
        }
        MediaScannerConnection.scanFile(getContext(), new String[]{this.b.getSchemeSpecificPart()}, new String[]{"image/jpeg", "image/png"}, null);
        IMediaEditor iMediaEditor = (IMediaEditor) m.a(IMediaEditor.class);
        if (iMediaEditor != null) {
            Intent a2 = iMediaEditor.a(getContext());
            a2.putExtra(Constants.TRAFFIC_URI, this.b);
            a(a2, 100);
            return;
        }
        IMUIManager.a().a((IMMessage) com.sankuai.xm.imui.common.util.c.a(a, false), false);
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin, com.sankuai.xm.imui.base.BaseActivity.a
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8309a9bf1e4a6dea624a890032388116", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8309a9bf1e4a6dea624a890032388116");
        } else if (i == 0) {
            if (i2 == -1) {
                a(15);
            }
        } else if (i == 100 && i2 == -1) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            boolean a = f.a(intent, "isOriginImage", false);
            if (com.sankuai.xm.base.util.b.a((Collection<?>) parcelableArrayListExtra)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                d.a("PhotoPluginInteractFragment. onActivityResult, uri = " + uri.getPath(), new Object[0]);
                arrayList.add(com.sankuai.xm.imui.common.util.c.a(uri.getPath(), a));
            }
            IMUIManager.a().a((List<IMMessage>) arrayList, false);
        }
    }

    private Uri k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "166c1cf96a5d70662d0a49bcc34fc949", 6917529027641081856L)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "166c1cf96a5d70662d0a49bcc34fc949");
        }
        try {
            if (Build.VERSION.SDK_INT > 29) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", "IMG_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()) + ".jpg");
                contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + "/DaXiang_Chat");
                return k.b(getContext()).a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            }
            return k.a(getContext(), n.a(getContext()), DxFileProvider.a(getContext()));
        } catch (Throwable unused) {
            d.d("CameraPlugin::invokeCamera::getUriForFile error.", new Object[0]);
            return null;
        }
    }
}
