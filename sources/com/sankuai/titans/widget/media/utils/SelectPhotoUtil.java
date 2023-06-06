package com.sankuai.titans.widget.media.utils;

import android.content.Context;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.widget.media.entity.Photo;
import com.sankuai.titans.widget.media.entity.PhotoDirectory;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SelectPhotoUtil {
    public static final String ALL_ID = "ALL";
    public static final int PAGE_COUNT = 200;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final String[] DIRECTOR_IMAGE_PROJECTION = {"bucket_id", "bucket_display_name"};
    private static final String[] DIRECTOR_VIDEO_PROJECTION = {"bucket_id", "bucket_display_name"};
    private static final String[] IMAGE_PROJECTION = {"_id", "_data", "bucket_id", "_size", "mime_type"};
    private static final String[] VIDEO_PROJECTION = {"_id", "_data", "bucket_id", "duration", "_size", "mime_type"};

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface DirectorCallback {
        void onDirectorResult(List<PhotoDirectory> list);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface PhotoCallback {
        void onPhotoResult(List<Photo> list);
    }

    public static void getDirector(Context context, boolean z, boolean z2, DirectorCallback directorCallback) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), directorCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7102bcc5132aca016597de04cb524439", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7102bcc5132aca016597de04cb524439");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        ArrayList arrayList = new ArrayList();
        PhotoDirectory photoDirectory = new PhotoDirectory();
        if (z) {
            photoDirectory.setName(applicationContext.getString(R.string.__picker_all_image_and_video));
        } else if (z2) {
            photoDirectory.setName(applicationContext.getString(R.string.__picker_all_video));
        } else {
            photoDirectory.setName(applicationContext.getString(R.string.__picker_all_image));
        }
        photoDirectory.setId(ALL_ID);
        arrayList.add(0, photoDirectory);
        finishDirector(directorCallback, arrayList);
    }

    public static void getPhoto(Context context, final String str, final boolean z, final boolean z2, final boolean z3, final int i, final long j, final long j2, final long j3, final String str2, final String str3, final String str4, final PhotoCallback photoCallback) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Integer.valueOf(i), new Long(j), new Long(j2), new Long(j3), str2, str3, str4, photoCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d6b4b786153b19ead0647e860f858c55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d6b4b786153b19ead0647e860f858c55");
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        ThreadUtil.getInstance().executeOnIOThread(new Runnable() { // from class: com.sankuai.titans.widget.media.utils.SelectPhotoUtil.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Code restructure failed: missing block: B:68:0x01d4, code lost:
                if (r18.toLowerCase().contains(r1.toLowerCase()) != false) goto L70;
             */
            /* JADX WARN: Code restructure failed: missing block: B:79:0x0208, code lost:
                if (r19.toLowerCase().contains(r1.toLowerCase()) != false) goto L68;
             */
            /* JADX WARN: Code restructure failed: missing block: B:93:0x0242, code lost:
                if (0 != 0) goto L75;
             */
            /* JADX WARN: Removed duplicated region for block: B:84:0x022f  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 589
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.titans.widget.media.utils.SelectPhotoUtil.AnonymousClass1.run():void");
            }
        });
    }

    public static void getTakePhoto(Context context, final String str, final String str2, final boolean z, final PhotoCallback photoCallback) {
        Object[] objArr = {context, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), photoCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d8c0ad8ee82550fd99584121079a6ecb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d8c0ad8ee82550fd99584121079a6ecb");
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        ThreadUtil.getInstance().executeOnIOThread(new Runnable() { // from class: com.sankuai.titans.widget.media.utils.SelectPhotoUtil.2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 262
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.titans.widget.media.utils.SelectPhotoUtil.AnonymousClass2.run():void");
            }
        });
    }

    private static void finishDirector(final DirectorCallback directorCallback, final List<PhotoDirectory> list) {
        Object[] objArr = {directorCallback, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "60beaf155959dd58dd7a756c627efdcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "60beaf155959dd58dd7a756c627efdcc");
        } else {
            ThreadUtil.getInstance().executeOnUIThread(new Runnable() { // from class: com.sankuai.titans.widget.media.utils.SelectPhotoUtil.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3eb7f686552c94df6225111144952d40", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3eb7f686552c94df6225111144952d40");
                    } else if (DirectorCallback.this != null) {
                        DirectorCallback.this.onDirectorResult(list);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void finishPhoto(final PhotoCallback photoCallback, final List<Photo> list) {
        Object[] objArr = {photoCallback, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1ee6ad517867956e367c4c4203e93342", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1ee6ad517867956e367c4c4203e93342");
        } else {
            ThreadUtil.getInstance().executeOnUIThread(new Runnable() { // from class: com.sankuai.titans.widget.media.utils.SelectPhotoUtil.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6f958d69d642882c9410c15c3d70ce47", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6f958d69d642882c9410c15c3d70ce47");
                    } else if (PhotoCallback.this != null) {
                        PhotoCallback.this.onPhotoResult(list);
                    }
                }
            });
        }
    }
}
