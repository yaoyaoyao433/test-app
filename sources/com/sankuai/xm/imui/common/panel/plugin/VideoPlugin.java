package com.sankuai.xm.imui.common.panel.plugin;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.g;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.base.util.ae;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.base.util.v;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.VideoMessage;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.common.util.l;
import com.sankuai.xm.video.RecordVideoActivity;
import com.sankuai.xm.video.VideoInfo;
import com.sankuai.xm.video.f;
import com.tencent.connect.share.QzonePublish;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class VideoPlugin extends Plugin {
    public static ChangeQuickRedirect c;
    private com.sankuai.xm.video.c a;

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public int getPluginIcon() {
        return R.drawable.xm_sdk_vd_ic_video;
    }

    public static /* synthetic */ void a(VideoPlugin videoPlugin) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, videoPlugin, changeQuickRedirect, false, "b7544e17305b95bcef8cce426f4adfcd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, videoPlugin, changeQuickRedirect, false, "b7544e17305b95bcef8cce426f4adfcd");
            return;
        }
        if (videoPlugin.a == null) {
            videoPlugin.a = new com.sankuai.xm.video.c() { // from class: com.sankuai.xm.imui.common.panel.plugin.VideoPlugin.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.video.c
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b422558db0df3ccc0aa1389b536504cc", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b422558db0df3ccc0aa1389b536504cc");
                    } else {
                        d.c("VideoPlugin::onCancel", new Object[0]);
                    }
                }

                @Override // com.sankuai.xm.video.c
                public final void a(VideoInfo videoInfo) {
                    Object[] objArr2 = {videoInfo};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c7c484c9560be6756828e96f7814494", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c7c484c9560be6756828e96f7814494");
                        return;
                    }
                    VideoMessage a2 = com.sankuai.xm.imui.common.util.c.a(videoInfo.b, videoInfo.c, System.currentTimeMillis(), (int) videoInfo.d, (short) videoInfo.f, (short) videoInfo.g, (int) videoInfo.e);
                    d.b("VideoPlugin::onSuccess, uri = " + videoInfo.b, new Object[0]);
                    IMUIManager.a().a((IMMessage) a2, false);
                }
            };
        }
        f a = f.a();
        Context context = videoPlugin.getContext();
        com.sankuai.xm.video.c cVar = videoPlugin.a;
        Object[] objArr2 = {context, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "d7d508416283fc88d136a0bd97502ac8", 6917529027641081856L)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "d7d508416283fc88d136a0bd97502ac8")).booleanValue();
            return;
        }
        String str = a.d;
        if (TextUtils.isEmpty(str) || !k.d(str)) {
            return;
        }
        a.b = cVar;
        Intent intent = new Intent(context, RecordVideoActivity.class);
        intent.setPackage(context.getPackageName());
        intent.putExtra(QzonePublish.PUBLISH_TO_QZONE_VIDEO_PATH, str);
        if (ActivityUtils.a(context, intent)) {
            ActivityUtils.b(context, intent);
        }
    }

    public VideoPlugin(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "096bdf61deb39c5ca833da7b9df336b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "096bdf61deb39c5ca833da7b9df336b3");
        }
    }

    private VideoPlugin(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a84f63595d452d2cf916e65283b6aba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a84f63595d452d2cf916e65283b6aba");
        }
    }

    public VideoPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f109e770d09c7b872499bdd27b36ed4b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f109e770d09c7b872499bdd27b36ed4b");
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1e59a9e08624e183b6d21affe884ce1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1e59a9e08624e183b6d21affe884ce1");
            return;
        }
        v.a a = v.a().a(PermissionGuard.PERMISSION_CAMERA, "jcyf-e4b399808a333f25", new ae() { // from class: com.sankuai.xm.imui.common.panel.plugin.VideoPlugin.4
            public static ChangeQuickRedirect b;
            private g d = j.a();

            @Override // com.sankuai.xm.base.util.ae
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "041710c8916c2c3e88ea32e34acbb70c", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "041710c8916c2c3e88ea32e34acbb70c");
                    return;
                }
                d.c("VideoPlugin::onOpen::camera deny.", new Object[0]);
                if (VideoPlugin.this.c(262144)) {
                    return;
                }
                l.a(VideoPlugin.this.getContext(), R.string.xm_sdk_perm_camera);
            }
        }).a(PermissionGuard.PERMISSION_MICROPHONE, "jcyf-e4b399808a333f25", new ae() { // from class: com.sankuai.xm.imui.common.panel.plugin.VideoPlugin.3
            public static ChangeQuickRedirect b;
            private g d = j.a();

            @Override // com.sankuai.xm.base.util.ae
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58eb9e04385fb2b9c18199fcf149cb33", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58eb9e04385fb2b9c18199fcf149cb33");
                    return;
                }
                d.c("VideoPlugin::onOpen::mic deny.", new Object[0]);
                if (VideoPlugin.this.c(262144)) {
                    return;
                }
                l.a(VideoPlugin.this.getContext(), R.string.xm_sdk_perm_audio);
            }
        }).a(PermissionGuard.PERMISSION_STORAGE_WRITE, "jcyf-e4b399808a333f25", new ae() { // from class: com.sankuai.xm.imui.common.panel.plugin.VideoPlugin.2
            public static ChangeQuickRedirect b;
            private g d = j.a();

            @Override // com.sankuai.xm.base.util.ae
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58289b42b3f1e2c7cc9fe00622714642", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58289b42b3f1e2c7cc9fe00622714642");
                    return;
                }
                d.c("CameraPlugin::onOpen::sdcard deny", new Object[0]);
                if (VideoPlugin.this.c(262144)) {
                    return;
                }
                l.a(VideoPlugin.this.getContext(), R.string.xm_sdk_perm_storage);
            }
        });
        a.b = new ae() { // from class: com.sankuai.xm.imui.common.panel.plugin.VideoPlugin.1
            public static ChangeQuickRedirect b;
            private g d = j.a();

            @Override // com.sankuai.xm.base.util.ae
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d16207d715fd863de6ee551ae21ee6f5", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d16207d715fd863de6ee551ae21ee6f5");
                } else {
                    VideoPlugin.a(VideoPlugin.this);
                }
            }
        };
        a.a();
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbab580feed7f1ef6afb763c874fd142", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbab580feed7f1ef6afb763c874fd142");
            return;
        }
        if (this.a != null && f.a().b == this.a) {
            f.a().b = null;
        }
        super.e();
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public String getPluginName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc93aeac38959fef58266e07195d9dad", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc93aeac38959fef58266e07195d9dad") : getResources().getString(R.string.xm_sdk_app_plugin_video);
    }
}
