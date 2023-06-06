package com.meituan.android.screenshot.task;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Keep;
import android.support.v4.content.ScreenShotModernAsyncTask;
import android.text.TextUtils;
import com.meituan.android.screenshot.manager.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ScreenShotProcessorTask extends ScreenShotModernAsyncTask<Void, Void, ScreenInfo> {
    public static ChangeQuickRedirect a;
    private final Context b;
    private final Uri c;
    private final long d;
    private final String e;
    private final String f;

    @Override // android.support.v4.content.ModernAsyncTask
    public /* synthetic */ Object doInBackground(Object[] objArr) {
        Object[] objArr2 = {(Void[]) objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "19b6be26d2c1a9813544afd2f206efbb", RobustBitConfig.DEFAULT_VALUE) ? (ScreenInfo) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "19b6be26d2c1a9813544afd2f206efbb") : a(this.b, this.c);
    }

    @Override // android.support.v4.content.ModernAsyncTask
    public /* synthetic */ void onPostExecute(Object obj) {
        ScreenInfo screenInfo = (ScreenInfo) obj;
        Object[] objArr = {screenInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "309eba771d58538015eb875cd1007275", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "309eba771d58538015eb875cd1007275");
            return;
        }
        b.a().h = false;
        if (screenInfo == null || isCancelled() || !b.a().b) {
            return;
        }
        Context context = this.b;
        Object[] objArr2 = {context, screenInfo};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "245413a57fe5b404c0efbf5f50676407", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "245413a57fe5b404c0efbf5f50676407");
        } else if (context == null || screenInfo == null || TextUtils.isEmpty(screenInfo.path)) {
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("imeituan://www.meituan.com/screenshotfloat").buildUpon().build());
            intent.putExtra("screen_shot_img_uri", screenInfo.path);
            intent.addFlags(y.a);
            intent.setPackage(context.getPackageName());
            context.startActivity(intent);
        }
    }

    public ScreenShotProcessorTask(Context context, Uri uri, long j) {
        Object[] objArr = {context, uri, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5da0ee687ecc717fbe247eccfa720704", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5da0ee687ecc717fbe247eccfa720704");
            return;
        }
        this.e = "screenshot";
        this.f = "Screenshots";
        this.b = context;
        this.c = uri;
        this.d = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.meituan.android.screenshot.task.ScreenShotProcessorTask.ScreenInfo a(android.content.Context r13, android.net.Uri r14) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.screenshot.task.ScreenShotProcessorTask.a(android.content.Context, android.net.Uri):com.meituan.android.screenshot.task.ScreenShotProcessorTask$ScreenInfo");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public class ScreenInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String bucket_name;
        public String name;
        public String path;
        public long time;
        public String type;

        public ScreenInfo() {
        }
    }
}
