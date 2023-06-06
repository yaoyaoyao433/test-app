package com.sankuai.waimai.store.mrn;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.im.medical.doctor.SGIMUploadImageService;
import com.sankuai.waimai.store.order.prescription.upload.e;
import com.sankuai.waimai.store.order.prescription.upload.f;
import com.sankuai.waimai.store.util.al;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class IMUploadImageModule implements SGIMUploadImageService, f.b<String> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Activity mCurrentActivity;
    private final ArrayList<e> mData;
    private com.sankuai.waimai.store.im.medical.doctor.a mUploadCallback;
    private com.sankuai.waimai.store.order.prescription.upload.b mUploader;
    private String mVolleyTag;

    @Override // com.sankuai.waimai.store.order.prescription.upload.f.b
    public void onTaskProgress(int i, int i2, int i3) {
    }

    @Override // com.sankuai.waimai.store.order.prescription.upload.f.b
    public void onTaskStart(int i, int i2) {
    }

    public IMUploadImageModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6319829d75ba73039018640e7acef4b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6319829d75ba73039018640e7acef4b");
        } else {
            this.mData = new ArrayList<>();
        }
    }

    @Override // com.sankuai.waimai.store.im.medical.doctor.SGIMUploadImageService
    public void setParams(String str, Activity activity) {
        this.mVolleyTag = str;
        this.mCurrentActivity = activity;
    }

    @Override // com.sankuai.waimai.store.im.medical.doctor.SGIMUploadImageService
    public void onDestory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e7be8335490a2a596e2c16410b7659f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e7be8335490a2a596e2c16410b7659f");
            return;
        }
        this.mData.clear();
        if (this.mUploader != null) {
            this.mUploader.cancel();
            this.mUploader = null;
        }
        al.cancel(this.mVolleyTag);
    }

    @Override // com.sankuai.waimai.store.im.medical.doctor.SGIMUploadImageService
    public void startUpload(ArrayList<String> arrayList, int i, int i2, com.sankuai.waimai.store.im.medical.doctor.a aVar) {
        Object[] objArr = {arrayList, Integer.valueOf(i), Integer.valueOf(i2), aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76fb5eb84f6989bedd029ea462bc5bed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76fb5eb84f6989bedd029ea462bc5bed");
            return;
        }
        this.mUploadCallback = aVar;
        this.mData.clear();
        setHookFactory(i, i2);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!TextUtils.isEmpty(next)) {
                this.mData.add(new e(next));
            }
        }
        for (int i3 = 0; i3 < this.mData.size(); i3++) {
            this.mData.get(i3).b = i3;
        }
        if (this.mUploader == null) {
            this.mUploader = new com.sankuai.waimai.store.order.prescription.upload.b(this.mCurrentActivity);
            this.mUploader.e = this;
        }
        this.mUploader.a(this.mData);
    }

    private void setHookFactory(final int i, final int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2f2407e0e65a71607eccffcb2e6554f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2f2407e0e65a71607eccffcb2e6554f");
            return;
        }
        if (i <= 0) {
            i = 1920;
        }
        if (i2 <= 0) {
            i2 = 1920;
        }
        com.sankuai.waimai.store.order.prescription.upload.d.b = new com.sankuai.waimai.store.order.prescription.upload.a() { // from class: com.sankuai.waimai.store.mrn.IMUploadImageModule.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.order.prescription.upload.c
            @NonNull
            public final com.sankuai.waimai.ugc.image.a a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "86e7a506035f41e1d4ed2535bbe1bddf", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.ugc.image.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "86e7a506035f41e1d4ed2535bbe1bddf") : com.sankuai.waimai.order.confirm.image.upload.a.a(i, i2, "v1/upload/inquiry");
            }
        };
    }

    @Override // com.sankuai.waimai.store.order.prescription.upload.f.b
    public boolean isFinishing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ff31acef585c0455751fbddfa838b7d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ff31acef585c0455751fbddfa838b7d")).booleanValue() : this.mCurrentActivity == null || this.mCurrentActivity.isFinishing();
    }

    @Override // com.sankuai.waimai.store.order.prescription.upload.f.b
    public void onTaskFailed(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a532a82acd2f29645cbe827c9acd4a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a532a82acd2f29645cbe827c9acd4a0");
        } else if (((e) com.sankuai.shangou.stone.util.a.a((List<Object>) this.mData, i)) != null) {
            this.mData.remove(i);
        }
    }

    @Override // com.sankuai.waimai.store.order.prescription.upload.f.b
    public void onTaskSuccess(int i, String str, int i2) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ee15fbd67bd3114e55952c42c9f7a37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ee15fbd67bd3114e55952c42c9f7a37");
            return;
        }
        e eVar = (e) com.sankuai.shangou.stone.util.a.a((List<Object>) this.mData, i);
        if (eVar != null) {
            eVar.d = str;
        }
    }

    @Override // com.sankuai.waimai.store.order.prescription.upload.f.b
    public void onTasksComplete(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2620c69d3909fcaad4df817f68f298ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2620c69d3909fcaad4df817f68f298ef");
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<e> arrayList2 = new ArrayList();
        Iterator<e> it = this.mData.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (!TextUtils.isEmpty(next.c) && !TextUtils.isEmpty(next.d) && new File(next.c).exists()) {
                arrayList2.add(next);
            }
        }
        for (e eVar : arrayList2) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", eVar.d);
            hashMap.put("orginPath", eVar.c);
            arrayList.add(hashMap);
        }
    }
}
