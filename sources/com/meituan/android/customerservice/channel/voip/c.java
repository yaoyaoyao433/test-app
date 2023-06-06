package com.meituan.android.customerservice.channel.voip;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.customerservice.channel.retrofit.UploadService;
import com.meituan.android.customerservice.channel.retrofit.bean.CaseUploadVoucherSyncRequest;
import com.meituan.android.customerservice.channel.retrofit.bean.UploadFileResultEntity;
import com.meituan.android.customerservice.channel.upload.UploadFilesDialog;
import com.meituan.android.customerservice.channel.upload.UploadFilesProcessDialog;
import com.meituan.android.customerservice.channel.upload.bean.UploadFileInfo;
import com.meituan.android.customerservice.retrofit.bean.HttpResult;
import com.meituan.android.customerservice.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final Integer g = 6291456;
    public Context b;
    UploadFilesDialog c;
    String d;
    String e;
    boolean f;
    private j h;
    private com.meituan.android.customerservice.channel.voip.b i;
    private long j;
    private long k;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a23054b71b63bf7795f8b78e0b6d517", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a23054b71b63bf7795f8b78e0b6d517");
            return;
        }
        this.d = "";
        this.e = "";
        this.f = false;
        this.k = 100L;
    }

    public static /* synthetic */ UploadFilesDialog a(c cVar, UploadFilesDialog uploadFilesDialog) {
        cVar.c = null;
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b {
        private static c a = new c();
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2fe777665c2955944c5a14037b0e8cbd", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2fe777665c2955944c5a14037b0e8cbd") : b.a;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.customerservice.channel.voip.c$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements UploadFilesDialog.a {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ Activity b;

        public AnonymousClass3(Activity activity) {
            this.b = activity;
        }

        @Override // com.meituan.android.customerservice.channel.upload.UploadFilesDialog.a
        public final void a(ArrayList<UploadFileInfo> arrayList, int i) {
            Object[] objArr = {arrayList, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e40d094c9dea113b71f153a59b15961c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e40d094c9dea113b71f153a59b15961c");
                return;
            }
            c.this.j = 0L;
            c.this.i = c.this.a(this.b, arrayList, i);
            com.meituan.android.customerservice.channel.upload.c cVar = new com.meituan.android.customerservice.channel.upload.c(new com.meituan.android.customerservice.channel.upload.a() { // from class: com.meituan.android.customerservice.channel.voip.c.3.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.customerservice.channel.upload.a
                public final void a(final long j) {
                    Object[] objArr2 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d02b934d885acbecf94853b077e779e3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d02b934d885acbecf94853b077e779e3");
                    } else {
                        f.a().post(new Runnable() { // from class: com.meituan.android.customerservice.channel.voip.c.3.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c6343d55d2813dd0a91dbb016c9cdf78", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c6343d55d2813dd0a91dbb016c9cdf78");
                                } else if (c.this.c != null) {
                                    c.this.j = j + c.this.j;
                                    int i2 = (int) ((c.this.j * 100) / c.this.i.d);
                                    int i3 = i2 >= 0 ? i2 : 0;
                                    if (i3 >= 99) {
                                        i3 = 99;
                                    }
                                    c.this.c.a(i3);
                                }
                            }
                        });
                    }
                }
            });
            ArrayList arrayList2 = new ArrayList();
            c.this.h = new a(cVar, arrayList, arrayList2);
            if (c.this.i.a() == null) {
                if (c.this.c != null) {
                    c.this.c.a(arrayList.size() - arrayList2.size(), new ArrayList<>(), R.string.cs_upload_files_upload_permission_failed);
                    return;
                }
                return;
            }
            com.meituan.android.customerservice.channel.voip.a a2 = c.this.i.a();
            com.meituan.android.customerservice.channel.retrofit.a.a(c.this.b, a2.b, a2.c.get(a2.d), a2.e, a2.d, a2.a, com.meituan.android.customerservice.cscallsdk.d.j().g().c(), c.this.e, c.this.d, c.this.f, c.this.h, cVar, a2.f);
        }

        @Override // com.meituan.android.customerservice.channel.upload.UploadFilesDialog.a
        public final void a(CaseUploadVoucherSyncRequest caseUploadVoucherSyncRequest) {
            Object[] objArr = {caseUploadVoucherSyncRequest};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19946ab0d05d12bb27b02f7c390c7a02", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19946ab0d05d12bb27b02f7c390c7a02");
                return;
            }
            d.a().a("OPERATION", "提交凭证");
            Context context = c.this.b;
            String c = com.meituan.android.customerservice.cscallsdk.d.j().g().c();
            String str = c.this.e;
            String str2 = c.this.d;
            boolean z = c.this.f;
            j<HttpResult> jVar = new j<HttpResult>() { // from class: com.meituan.android.customerservice.channel.voip.c.3.2
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final void onCompleted() {
                }

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    HttpResult httpResult = (HttpResult) obj;
                    Object[] objArr2 = {httpResult};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd301501971611baec78c16fdebe0a08", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd301501971611baec78c16fdebe0a08");
                        return;
                    }
                    com.meituan.android.customerservice.utils.c.a("submitProofs", "result:" + httpResult.toString());
                    if (c.this.c != null) {
                        c.this.c.b(httpResult.getSuccess());
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c7280f7cb7e424c3a931f4a993d8765", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c7280f7cb7e424c3a931f4a993d8765");
                        return;
                    }
                    com.meituan.android.customerservice.utils.c.a("submitProofs", "onError:" + th.toString());
                    if (c.this.c != null) {
                        c.this.c.b(false);
                    }
                }
            };
            Object[] objArr2 = {context, c, str, str2, caseUploadVoucherSyncRequest, Byte.valueOf(z ? (byte) 1 : (byte) 0), jVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.customerservice.channel.retrofit.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f69d48f773d3c4b3d10101455b9c5d40", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f69d48f773d3c4b3d10101455b9c5d40");
                return;
            }
            com.meituan.android.customerservice.utils.c.a("submitProofs", "sessionId:" + c + " ,openId=" + str + " ,visitId=" + str2 + " ,isNative:" + z);
            UploadService uploadService = (UploadService) com.meituan.android.customerservice.channel.retrofit.a.a(com.meituan.android.customerservice.utils.b.a(context), null, 10L).a(UploadService.class);
            HashMap hashMap = new HashMap();
            hashMap.put("openId", str);
            hashMap.put("appType", Integer.valueOf(com.meituan.android.customerservice.utils.b.c()));
            hashMap.put("category", "0");
            if (z) {
                hashMap.put("channel", 3022);
                hashMap.put("visitId", "0");
            } else {
                hashMap.put("visitId", str2);
            }
            hashMap.put("sessionId", c);
            rx.d.a(jVar, uploadService.submitProofs(hashMap, caseUploadVoucherSyncRequest).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
        }

        @Override // com.meituan.android.customerservice.channel.upload.UploadFilesDialog.a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0deb10146eb73d60045ecd275c2302d8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0deb10146eb73d60045ecd275c2302d8");
                return;
            }
            if (c.this.h != null) {
                c.this.h.unsubscribe();
                c.this.h = null;
            }
            if (c.this.c != null) {
                c.this.c.a();
            }
        }
    }

    public final com.meituan.android.customerservice.channel.voip.b a(Activity activity, ArrayList<UploadFileInfo> arrayList, int i) {
        File file;
        byte[] a2;
        int i2 = 1;
        Object[] objArr = {activity, arrayList, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "889e22f3cd1ff50527728e2081a91e4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.customerservice.channel.voip.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "889e22f3cd1ff50527728e2081a91e4b");
        }
        com.meituan.android.customerservice.channel.voip.b bVar = new com.meituan.android.customerservice.channel.voip.b();
        ArrayList arrayList2 = new ArrayList();
        Iterator<UploadFileInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            UploadFileInfo next = it.next();
            ByteArrayOutputStream byteArrayOutputStream = null;
            if (i == 0 && !TextUtils.isEmpty(next.getLocalPath())) {
                file = new File(next.getLocalPath());
                String b2 = com.meituan.android.customerservice.channel.utils.a.b(next.getFileName());
                char c = 65535;
                int hashCode = b2.hashCode();
                if (hashCode != 105441) {
                    if (hashCode != 111145) {
                        if (hashCode == 3268712 && b2.equals(CommonConstant.File.JPEG)) {
                            c = 1;
                        }
                    } else if (b2.equals("png")) {
                        c = 2;
                    }
                } else if (b2.equals(CommonConstant.File.JPG)) {
                    c = 0;
                }
                switch (c) {
                    case 0:
                    case 1:
                        byteArrayOutputStream = com.meituan.android.customerservice.channel.utils.a.a(activity, file, Bitmap.CompressFormat.JPEG, 20);
                        break;
                    case 2:
                        byteArrayOutputStream = com.meituan.android.customerservice.channel.utils.a.a(activity, file, Bitmap.CompressFormat.PNG, 20);
                        break;
                }
            } else {
                file = (i != i2 || next.getVideoData() == null || TextUtils.isEmpty(next.getVideoData().videoPath)) ? null : new File(next.getVideoData().videoPath);
            }
            if (file == null || !file.exists()) {
                com.meituan.android.customerservice.utils.c.a("burstUpload", "file == null || !file.exists()");
            } else {
                if (byteArrayOutputStream != null) {
                    a2 = byteArrayOutputStream.toByteArray();
                } else {
                    a2 = com.meituan.android.customerservice.channel.utils.a.a(file);
                }
                if (a2 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    int i3 = 0;
                    while (i3 < a2.length) {
                        int min = Math.min(g.intValue() + i3, a2.length);
                        arrayList3.add(Arrays.copyOfRange(a2, i3, min));
                        i3 = min;
                    }
                    bVar.d += a2.length;
                    com.meituan.android.customerservice.channel.voip.a aVar = new com.meituan.android.customerservice.channel.voip.a();
                    long j = this.k;
                    this.k = 1 + j;
                    aVar.a = j;
                    aVar.b = next.getFileName();
                    aVar.f = next.getFileType();
                    aVar.c = arrayList3;
                    aVar.e = arrayList3.size();
                    aVar.d = 0;
                    arrayList2.add(aVar);
                }
            }
            i2 = 1;
        }
        bVar.c = arrayList2;
        bVar.b = 0;
        return bVar;
    }

    public final void a(ArrayList<UploadFileInfo> arrayList, int i) {
        Object[] objArr = {arrayList, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fecd1033c15b1a962f6667243e92578", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fecd1033c15b1a962f6667243e92578");
        } else if (this.c != null) {
            final UploadFilesDialog uploadFilesDialog = this.c;
            Object[] objArr2 = {arrayList, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = UploadFilesDialog.a;
            if (PatchProxy.isSupport(objArr2, uploadFilesDialog, changeQuickRedirect2, false, "8f28ec55f96ab334e934b2cb193ccd65", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, uploadFilesDialog, changeQuickRedirect2, false, "8f28ec55f96ab334e934b2cb193ccd65");
            } else if (arrayList == null || arrayList.isEmpty()) {
                uploadFilesDialog.show();
            } else if (uploadFilesDialog.h != null) {
                Object[] objArr3 = {0};
                ChangeQuickRedirect changeQuickRedirect3 = UploadFilesDialog.a;
                if (PatchProxy.isSupport(objArr3, uploadFilesDialog, changeQuickRedirect3, false, "2ba7903a1eb716c09c3b1763cb72d9de", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, uploadFilesDialog, changeQuickRedirect3, false, "2ba7903a1eb716c09c3b1763cb72d9de");
                } else if (uploadFilesDialog.d != null && !uploadFilesDialog.d.isFinishing()) {
                    uploadFilesDialog.dismiss();
                    if (uploadFilesDialog.g != null && uploadFilesDialog.g.isShowing()) {
                        uploadFilesDialog.g.a(0);
                    } else {
                        uploadFilesDialog.g = new UploadFilesProcessDialog(uploadFilesDialog.d);
                        if (uploadFilesDialog.h != null) {
                            uploadFilesDialog.g.b = new UploadFilesProcessDialog.a() { // from class: com.meituan.android.customerservice.channel.upload.UploadFilesDialog.10
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.android.customerservice.channel.upload.UploadFilesProcessDialog.a
                                public final void a() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "37fad489f869536611e1adce63c50879", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "37fad489f869536611e1adce63c50879");
                                    } else {
                                        uploadFilesDialog.h.a();
                                    }
                                }
                            };
                        }
                        uploadFilesDialog.g.show();
                        uploadFilesDialog.g.a(0);
                    }
                }
                uploadFilesDialog.h.a(arrayList, i);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    class a extends j<HttpResult<UploadFileResultEntity>> {
        public static ChangeQuickRedirect a;
        private com.meituan.android.customerservice.channel.upload.c c;
        private ArrayList<UploadFileInfo> d;
        private ArrayList<UploadFileInfo> e;

        @Override // rx.e
        public final void onCompleted() {
        }

        @Override // rx.e
        public final /* synthetic */ void onNext(Object obj) {
            HttpResult httpResult = (HttpResult) obj;
            boolean z = true;
            Object[] objArr = {httpResult};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7f3e2738407e3d5136f5b5192028452", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7f3e2738407e3d5136f5b5192028452");
            } else if (c.this.i.a() != null) {
                com.meituan.android.customerservice.channel.voip.a a2 = c.this.i.a();
                a2.d++;
                if (a2.d >= a2.c.size()) {
                    c.this.i.b++;
                    if (c.this.i.b < c.this.i.c.size()) {
                        a2 = c.this.i.a();
                    }
                } else {
                    z = false;
                }
                com.meituan.android.customerservice.utils.c.a("UploadFileSubscriber", "onNext data:" + httpResult.toString());
                if (httpResult == null || !httpResult.getSuccess() || httpResult.getData() == null) {
                    if (c.this.c != null) {
                        c.this.c.a(this.d.size() - this.e.size(), this.e);
                        return;
                    }
                    return;
                }
                UploadFileResultEntity uploadFileResultEntity = (UploadFileResultEntity) httpResult.getData();
                if (z && TextUtils.isEmpty(uploadFileResultEntity.getUploadPath())) {
                    if (c.this.c != null) {
                        c.this.c.a(this.d.size() - this.e.size(), this.e);
                        return;
                    }
                    return;
                }
                if (!TextUtils.isEmpty(uploadFileResultEntity.getUploadPath())) {
                    UploadFileInfo uploadFileInfo = new UploadFileInfo();
                    uploadFileInfo.setFileName(uploadFileResultEntity.getFilename());
                    int indexOf = this.d.indexOf(uploadFileInfo);
                    if (indexOf >= 0) {
                        UploadFileInfo uploadFileInfo2 = this.d.get(indexOf);
                        uploadFileInfo2.setUploadPath(uploadFileResultEntity.getUploadPath());
                        uploadFileInfo2.setFileSize(uploadFileResultEntity.getFileSize());
                        uploadFileInfo2.setUploadPath(uploadFileResultEntity.getUploadPath());
                        uploadFileInfo2.setFileSuffixes(uploadFileResultEntity.getFileType());
                        uploadFileInfo2.setKey(uploadFileResultEntity.getKey());
                        this.e.add(uploadFileInfo2);
                    }
                }
                if (c.this.i.b == c.this.i.c.size()) {
                    if (c.this.c != null) {
                        if (this.e.size() == this.d.size()) {
                            c.this.c.a(this.d);
                            return;
                        } else {
                            c.this.c.a(this.d.size() - this.e.size(), this.e);
                            return;
                        }
                    }
                    return;
                }
                c.this.h = new a(this.c, this.d, this.e);
                com.meituan.android.customerservice.channel.retrofit.a.a(c.this.b, a2.b, a2.c.get(a2.d), a2.e, a2.d, a2.a, com.meituan.android.customerservice.cscallsdk.d.j().g().c(), c.this.e, c.this.d, c.this.f, c.this.h, this.c, a2.f);
            }
        }

        public a(com.meituan.android.customerservice.channel.upload.c cVar, ArrayList<UploadFileInfo> arrayList, ArrayList<UploadFileInfo> arrayList2) {
            Object[] objArr = {c.this, cVar, arrayList, arrayList2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83b5ce86e699bd666a8d5a72ce084e94", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83b5ce86e699bd666a8d5a72ce084e94");
                return;
            }
            this.c = cVar;
            this.d = arrayList;
            this.e = arrayList2;
        }

        @Override // rx.e
        public final void onError(Throwable th) {
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83586be79899fd32bb863d4b25379305", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83586be79899fd32bb863d4b25379305");
                return;
            }
            com.meituan.android.customerservice.utils.c.a("UploadFileSubscriber", "onError:" + th.toString());
            if (c.this.c != null) {
                c.this.c.a(this.d.size() - this.e.size(), this.e);
            }
        }
    }
}
