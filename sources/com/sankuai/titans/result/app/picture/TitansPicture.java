package com.sankuai.titans.result.app.picture;

import android.app.Activity;
import android.content.Intent;
import android.provider.MediaStore;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.result.IPictureResultCallback;
import com.sankuai.titans.result.app.GetResult;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansPicture extends GetResult<GetPictureFragment> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public TitansPicture(Activity activity) {
        super(activity);
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bc1d86f87959e803987c23fb74b2f2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bc1d86f87959e803987c23fb74b2f2f");
        }
    }

    @Override // com.sankuai.titans.result.app.GetResult
    public GetPictureFragment newFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b27444dad98ecc30645b13be50e5b211", RobustBitConfig.DEFAULT_VALUE) ? (GetPictureFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b27444dad98ecc30645b13be50e5b211") : new GetPictureFragment();
    }

    public void getPhoto(int i, String str, IPictureResultCallback iPictureResultCallback) {
        Object[] objArr = {Integer.valueOf(i), str, iPictureResultCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50df62d4d2dcf0ef903a8b5b0e8b3b39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50df62d4d2dcf0ef903a8b5b0e8b3b39");
        } else {
            getFragment().getPicture(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), i, str, iPictureResultCallback);
        }
    }

    public void getVideo(int i, String str, IPictureResultCallback iPictureResultCallback) {
        Object[] objArr = {Integer.valueOf(i), str, iPictureResultCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7f5ba2ac4a85d82c8840d3af093f055", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7f5ba2ac4a85d82c8840d3af093f055");
        } else {
            getFragment().getPicture(new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI), i, str, iPictureResultCallback);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void takePhoto(int r18, final java.lang.String r19, java.io.File r20, final com.sankuai.titans.result.IPictureResultCallback r21) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.titans.result.app.picture.TitansPicture.takePhoto(int, java.lang.String, java.io.File, com.sankuai.titans.result.IPictureResultCallback):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    @android.annotation.SuppressLint({"QueryPermissionsNeeded"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void takeVideo(int r18, final java.lang.String r19, java.io.File r20, int r21, int r22, final com.sankuai.titans.result.IPictureResultCallback r23) {
        /*
            r17 = this;
            r7 = r17
            r8 = r19
            r10 = r22
            r0 = 6
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r12 = 0
            r11[r12] = r0
            r0 = 1
            r11[r0] = r8
            r13 = 2
            r11[r13] = r20
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r1 = 3
            r11[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            r1 = 4
            r11[r1] = r0
            r0 = 5
            r11[r0] = r23
            com.meituan.robust.ChangeQuickRedirect r14 = com.sankuai.titans.result.app.picture.TitansPicture.changeQuickRedirect
            java.lang.String r5 = "eec94f9946addeafa486e754f03ea526"
            r3 = 0
            r15 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r11
            r1 = r17
            r2 = r14
            r4 = r5
            r13 = r5
            r5 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L3f
            com.meituan.robust.PatchProxy.accessDispatch(r11, r7, r14, r12, r13)
            return
        L3f:
            if (r20 != 0) goto L49
            java.lang.String r0 = android.os.Environment.DIRECTORY_MOVIES     // Catch: java.io.IOException -> L49
            java.io.File r0 = com.sankuai.titans.result.util.PicturePathUtil.createFile(r0)     // Catch: java.io.IOException -> L49
            r5 = r0
            goto L4b
        L49:
            r5 = r20
        L4b:
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r0 = "android.media.action.VIDEO_CAPTURE"
            r6.<init>(r0)
            android.app.Activity r0 = r7.mActivity
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.ComponentName r0 = r6.resolveActivity(r0)
            if (r0 == 0) goto Ld4
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 <= r1) goto L76
            android.app.Activity r0 = r7.mActivity
            android.net.Uri r0 = com.sankuai.titans.result.util.PicturePathUtil.createMediaUri(r0, r12, r5, r8)
            java.lang.String r1 = "output"
            r6.putExtra(r1, r0)
            r1 = 2
            r6.addFlags(r1)
        L74:
            r3 = r0
            goto La5
        L76:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto La0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.app.Activity r1 = r7.mActivity
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            java.lang.String r1 = r1.packageName
            r0.append(r1)
            java.lang.String r1 = ".titans.fileprovider"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.app.Activity r1 = r7.mActivity
            android.content.Context r1 = r1.getApplicationContext()
            android.net.Uri r0 = android.support.v4.content.FileProvider.getUriForFile(r1, r0, r5)
            goto L74
        La0:
            android.net.Uri r0 = android.net.Uri.fromFile(r5)
            goto L74
        La5:
            if (r3 == 0) goto Lbb
            java.lang.String r0 = "output"
            r6.putExtra(r0, r3)
            java.lang.String r0 = "android.intent.extra.videoQuality"
            r1 = r21
            r6.putExtra(r0, r1)
            if (r10 <= 0) goto Lbb
            java.lang.String r0 = "android.intent.extra.durationLimit"
            r6.putExtra(r0, r10)
        Lbb:
            android.app.Fragment r0 = r17.getFragment()
            r9 = r0
            com.sankuai.titans.result.app.picture.GetPictureFragment r9 = (com.sankuai.titans.result.app.picture.GetPictureFragment) r9
            com.sankuai.titans.result.app.picture.TitansPicture$2 r10 = new com.sankuai.titans.result.app.picture.TitansPicture$2
            r0 = r10
            r1 = r17
            r2 = r23
            r4 = r19
            r0.<init>()
            r0 = r18
            r9.getPicture(r6, r0, r8, r10)
            return
        Ld4:
            if (r23 == 0) goto Ld9
            r23.onCancel()
        Ld9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.titans.result.app.picture.TitansPicture.takeVideo(int, java.lang.String, java.io.File, int, int, com.sankuai.titans.result.IPictureResultCallback):void");
    }
}
