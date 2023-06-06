package com.meituan.android.yoda.widget.tool;

import com.google.gson.JsonArray;
import com.meituan.android.yoda.bean.AESKeys;
import com.meituan.android.yoda.bean.S3Parameter;
import com.meituan.android.yoda.fragment.FaceDetectionFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e implements Runnable {
    public static ChangeQuickRedirect a;
    private String b;
    private byte[] c;
    private CountDownLatch d;
    private ByteArrayOutputStream e;
    private S3Parameter f;
    private AESKeys g;
    private JsonArray h;
    private int i;
    private int j;
    private boolean k;
    private a l;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        FaceDetectionFragment a();

        AtomicInteger b();

        Map<String, Object> c();
    }

    public e(String str, int i, byte[] bArr, S3Parameter s3Parameter, AESKeys aESKeys, CountDownLatch countDownLatch, JsonArray jsonArray, a aVar) {
        Object[] objArr = {str, Integer.valueOf(i), bArr, s3Parameter, aESKeys, countDownLatch, jsonArray, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2376761bc29bb0019549594e87411e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2376761bc29bb0019549594e87411e0");
            return;
        }
        this.e = null;
        this.i = 0;
        this.j = 0;
        this.k = false;
        this.l = aVar;
        this.b = str;
        this.c = bArr;
        this.d = countDownLatch;
        this.e = new ByteArrayOutputStream();
        this.f = s3Parameter;
        this.g = aESKeys;
        this.h = jsonArray;
        this.i = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01db  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.yoda.widget.tool.e.run():void");
    }
}
