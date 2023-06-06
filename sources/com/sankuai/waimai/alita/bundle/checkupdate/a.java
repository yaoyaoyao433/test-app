package com.sankuai.waimai.alita.bundle.checkupdate;

import android.content.Context;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.bundle.checkupdate.AlitaCheckUpdateStatus;
import com.sankuai.waimai.alita.bundle.download.update.BundleInfo;
import com.sankuai.waimai.alita.core.utils.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a b;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.bundle.checkupdate.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0692a {
        void a(@AlitaCheckUpdateStatus.State int i);

        void a(AlitaCheckUpdateResponse alitaCheckUpdateResponse);

        void b(AlitaCheckUpdateResponse alitaCheckUpdateResponse);
    }

    private static String b(boolean z) {
        return z ? "test" : "prod";
    }

    public static /* synthetic */ void a(a aVar, final AlitaCheckUpdateResponse alitaCheckUpdateResponse, boolean z) {
        List<BundleInfo> list;
        boolean z2 = false;
        Object[] objArr = {alitaCheckUpdateResponse, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "2e25a57e62c77963ee8c0e556cce8b8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "2e25a57e62c77963ee8c0e556cce8b8b");
            return;
        }
        Object[] objArr2 = {alitaCheckUpdateResponse};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "811726aeefbde2f9d94d23c645c01e35", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "811726aeefbde2f9d94d23c645c01e35")).booleanValue();
        } else if (alitaCheckUpdateResponse != null && alitaCheckUpdateResponse.body != null && ((list = alitaCheckUpdateResponse.body.b) == null || list.isEmpty())) {
            z2 = true;
        }
        if (z2) {
            final String a2 = aVar.a(z);
            d.a((d.a) new d.a<AlitaCheckUpdateResponse>() { // from class: com.sankuai.waimai.alita.bundle.checkupdate.a.5
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Object obj) {
                    j jVar = (j) obj;
                    Object[] objArr3 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9018683641b5b8dfb4f29be280837a4c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9018683641b5b8dfb4f29be280837a4c");
                        return;
                    }
                    boolean a3 = a.this.a(a2, alitaCheckUpdateResponse);
                    if (jVar.isUnsubscribed() || !a3) {
                        return;
                    }
                    jVar.onNext(alitaCheckUpdateResponse);
                    jVar.onCompleted();
                }
            }).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()).f();
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7be546c856830994080512c92e8d0121", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7be546c856830994080512c92e8d0121");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, AlitaCheckUpdateResponse alitaCheckUpdateResponse) {
        ObjectOutputStream objectOutputStream;
        File file;
        Object[] objArr = {str, alitaCheckUpdateResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d930be731299cf1aa331ea43395bbca8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d930be731299cf1aa331ea43395bbca8")).booleanValue();
        }
        ObjectOutputStream objectOutputStream2 = null;
        try {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c5b7a278c54e7e3a56518882ceda9d0", RobustBitConfig.DEFAULT_VALUE)) {
                file = (File) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c5b7a278c54e7e3a56518882ceda9d0");
            } else {
                File file2 = new File(str);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file = new File(file2, "checkupdate.json");
                if (!file.exists()) {
                    file.createNewFile();
                }
            }
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            try {
                objectOutputStream.writeObject(alitaCheckUpdateResponse);
                objectOutputStream.flush();
                f.a(objectOutputStream);
                return true;
            } catch (Exception unused) {
                f.a(objectOutputStream);
                return false;
            } catch (Throwable th) {
                objectOutputStream2 = objectOutputStream;
                th = th;
                f.a(objectOutputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            objectOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AlitaCheckUpdateResponse a(String str) {
        ObjectInputStream objectInputStream;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8edd9949c98d1f1a96597d5750daa7c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (AlitaCheckUpdateResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8edd9949c98d1f1a96597d5750daa7c6");
        }
        File file = new File(str);
        ObjectInputStream objectInputStream2 = null;
        if (file.exists()) {
            File file2 = new File(file, "checkupdate.json");
            if (file2.exists()) {
                try {
                    objectInputStream = new ObjectInputStream(new FileInputStream(file2));
                } catch (Exception unused) {
                    objectInputStream = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    AlitaCheckUpdateResponse alitaCheckUpdateResponse = (AlitaCheckUpdateResponse) objectInputStream.readObject();
                    f.a(objectInputStream);
                    return alitaCheckUpdateResponse;
                } catch (Exception unused2) {
                    f.a(objectInputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream2 = objectInputStream;
                    f.a(objectInputStream2);
                    throw th;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(boolean z) {
        Context applicationContext;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ae9a18a4deab9c1293d346598106c8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ae9a18a4deab9c1293d346598106c8f");
        }
        if (b.a == null || (applicationContext = b.a.getApplicationContext()) == null) {
            return null;
        }
        return com.sankuai.waimai.alita.bundle.a.a().b(applicationContext) + File.separator + "checkupdate" + File.separator + b(z) + File.separator;
    }
}
