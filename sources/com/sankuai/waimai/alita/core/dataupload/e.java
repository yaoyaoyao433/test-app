package com.sankuai.waimai.alita.core.dataupload;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.mlmodel.predictor.MLModelEngineManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.dataupload.AlitaModelDataUploadConfig;
import com.sankuai.waimai.alita.core.event.AlitaRealTimeEventCenter;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    String b;
    public a<String, AlitaModelDataUploadConfig> c;
    d d;
    public g e;

    public e(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84a18b6b0e8f276dd2a30028999f59e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84a18b6b0e8f276dd2a30028999f59e8");
            return;
        }
        this.c = new a<>();
        this.d = new d();
        this.e = new g();
        this.b = str;
        AlitaRealTimeEventCenter.getInstance().addEventListener(this.b, new com.sankuai.waimai.alita.core.event.c() { // from class: com.sankuai.waimai.alita.core.dataupload.e.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.core.event.c
            public final void a(com.sankuai.waimai.alita.core.event.a aVar) {
                Map<String, Object> e;
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "454e1b3daf0765f3f3d961a68d1d424d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "454e1b3daf0765f3f3d961a68d1d424d");
                    return;
                }
                e eVar = e.this;
                Object[] objArr3 = {aVar};
                ChangeQuickRedirect changeQuickRedirect3 = e.a;
                if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "6f365fc3cb44f191e4e6d0d815a2dfcd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "6f365fc3cb44f191e4e6d0d815a2dfcd");
                } else if (aVar != null) {
                    String d = aVar.d();
                    AlitaModelDataUploadConfig.a aVar2 = new AlitaModelDataUploadConfig.a();
                    aVar2.b = d;
                    if (!eVar.d.a(aVar2) || (e = aVar.e()) == null) {
                        return;
                    }
                    Object obj = e.get(MLModelEngineManager.RESULT_KEY_PREDICT_ID);
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        g gVar = eVar.e;
                        Object[] objArr4 = {str2};
                        ChangeQuickRedirect changeQuickRedirect4 = a.a;
                        c cVar = (c) (PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "fa5d48b4b0724f3d392e891319374405", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "fa5d48b4b0724f3d392e891319374405") : gVar.a().remove(str2));
                        if (cVar != null) {
                            eVar.a(cVar);
                        }
                    }
                }
            }
        });
    }

    public final void a(@Nullable com.sankuai.waimai.alita.core.config.observabledata.c<AlitaModelDataUploadConfig> cVar) {
        List<AlitaModelDataUploadConfig> list;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b39e918632255e7f0249a3db7b9aeec3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b39e918632255e7f0249a3db7b9aeec3");
        } else if (cVar != null && (list = (List) cVar.a()) != null) {
            for (AlitaModelDataUploadConfig alitaModelDataUploadConfig : list) {
                Object[] objArr2 = {alitaModelDataUploadConfig};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c0e9144ac35a7da5bd525232b039b00", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c0e9144ac35a7da5bd525232b039b00");
                } else if (alitaModelDataUploadConfig != null) {
                    String str = alitaModelDataUploadConfig.b;
                    if (!TextUtils.isEmpty(str)) {
                        this.c.a(str, alitaModelDataUploadConfig);
                        d dVar = this.d;
                        List<AlitaModelDataUploadConfig.a> list2 = alitaModelDataUploadConfig.e;
                        Object[] objArr3 = {list2};
                        ChangeQuickRedirect changeQuickRedirect3 = d.a;
                        if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "17f3a7dbc9ae4092ad0255626e51c103", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "17f3a7dbc9ae4092ad0255626e51c103");
                        } else if (list2 != null) {
                            for (AlitaModelDataUploadConfig.a aVar : list2) {
                                if (aVar != null) {
                                    Object[] objArr4 = {aVar};
                                    ChangeQuickRedirect changeQuickRedirect4 = d.a;
                                    if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "bdc48dbef25d71b32f52c570c7b3c407", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "bdc48dbef25d71b32f52c570c7b3c407");
                                    } else if (!dVar.a(aVar)) {
                                        dVar.b.add(aVar);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void a(@NonNull c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7e1ea5f6a0239457fea8f5c11e477d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7e1ea5f6a0239457fea8f5c11e477d6");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.a("AlitaModelDataUploadManager.uploadData(): data = " + cVar.toString());
        switch (cVar.i) {
            case 0:
            case 1:
                b.a(cVar.a(cVar.i));
                return;
            default:
                b.a(cVar.a(0));
                b.a(cVar.a(1));
                return;
        }
    }
}
