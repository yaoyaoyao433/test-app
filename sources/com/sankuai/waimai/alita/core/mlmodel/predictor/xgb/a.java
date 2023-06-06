package com.sankuai.waimai.alita.core.mlmodel.predictor.xgb;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.engine.b;
import com.sankuai.waimai.alita.core.jsexecutor.AlitaJSValue;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.AlitaTensor;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.ModelConfig;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.TensorConfig;
import com.sankuai.waimai.alita.core.mlmodel.predictor.d;
import com.sankuai.waimai.alita.core.mlmodel.predictor.e;
import com.sankuai.waimai.alita.core.mlmodel.predictor.exception.c;
import com.sankuai.waimai.alita.core.mlmodel.predictor.f;
import com.sankuai.waimai.alita.core.mlmodel.predictor.h;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements f {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.f
    @Nullable
    public final List<String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efeec7d317fdf050ee9b6982877f3769", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efeec7d317fdf050ee9b6982877f3769");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ModelConfig.ModelFileType.TYPE_ALITA_JS);
        return arrayList;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.core.mlmodel.predictor.xgb.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0710a extends com.sankuai.waimai.alita.core.mlmodel.predictor.base.a {
        public static ChangeQuickRedirect b;
        com.sankuai.waimai.alita.bundle.model.a c;
        String d;

        public C0710a(com.sankuai.waimai.alita.bundle.model.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bab7655563554288bdead5bd87b8ad2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bab7655563554288bdead5bd87b8ad2");
            } else {
                this.c = aVar;
            }
        }

        @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.base.a
        public final void a(TensorConfig tensorConfig, @NonNull List<AlitaTensor> list, @Nullable List<TensorConfig.TensorConfigItem> list2, @Nullable final h hVar) {
            Object[] objArr = {tensorConfig, list, list2, hVar};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e99e41a117c3308ccdbfb8572e7e989", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e99e41a117c3308ccdbfb8572e7e989");
            } else if (!e.a(list)) {
                a(hVar, new Exception("Alita Tensor not valid"));
            } else {
                try {
                    if (!TextUtils.isEmpty(this.d)) {
                        ArrayList arrayList = new ArrayList();
                        JSONObject jSONObject = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        JSONArray b2 = d.b(list);
                        int length = b2.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject optJSONObject = b2.optJSONObject(i);
                            if (optJSONObject != null) {
                                JSONArray optJSONArray = optJSONObject.optJSONArray(TensorConfig.KEY_INPUT_ARRAY);
                                if (optJSONArray == null) {
                                    optJSONArray = new JSONArray();
                                }
                                jSONArray.put(optJSONArray);
                            }
                        }
                        jSONObject.put(TensorConfig.KEY_INPUT_ARRAY, jSONArray);
                        if (list2 != null) {
                            jSONObject.put("output", d.a(list2));
                        }
                        arrayList.add(jSONObject);
                        b.a().a(this.d, arrayList, new com.sankuai.waimai.alita.core.engine.h() { // from class: com.sankuai.waimai.alita.core.mlmodel.predictor.xgb.a.a.2
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.alita.core.engine.h
                            public final void a(@Nullable String str, @Nullable AlitaJSValue alitaJSValue) {
                                Object[] objArr2 = {str, alitaJSValue};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ff60aabce05b1045b92a53b655cd0d6", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ff60aabce05b1045b92a53b655cd0d6");
                                } else if (alitaJSValue != null && alitaJSValue.getType() == AlitaJSValue.Type.STRING) {
                                    try {
                                        C0710a.this.a(hVar, new JSONObject(alitaJSValue.stringValue()).opt("data"));
                                    } catch (Exception e) {
                                        C0710a.this.a(hVar, e);
                                    }
                                } else {
                                    C0710a.this.a(hVar, new Exception("js result is not string"));
                                }
                            }

                            @Override // com.sankuai.waimai.alita.core.engine.h
                            public final void a(@Nullable Exception exc) {
                                Object[] objArr2 = {exc};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d41f093428fa9ffbec411b4aaf4d8c8", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d41f093428fa9ffbec411b4aaf4d8c8");
                                } else {
                                    C0710a.this.a(hVar, exc);
                                }
                            }
                        });
                        return;
                    }
                    a(hVar, new Exception("task key is empty"));
                } catch (Exception e) {
                    a(hVar, e);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.f
    public final void a(@NonNull com.sankuai.waimai.alita.bundle.model.a aVar, @Nullable final f.a aVar2) {
        Exception bVar;
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f0793c97688c5faa5803f52c9952865", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f0793c97688c5faa5803f52c9952865");
            return;
        }
        boolean z = (aVar.e == null || !aVar.e.a() || TextUtils.isEmpty(aVar.e.j)) ? false : true;
        boolean z2 = aVar.i != null && ModelConfig.ModelFileType.TYPE_ALITA_JS.equals(aVar.i.getModelFileType());
        String str = StringUtil.NULL;
        if (aVar.e != null) {
            str = aVar.e.j;
        }
        String str2 = StringUtil.NULL;
        if (aVar.i != null) {
            str2 = aVar.i.getModelFileType();
        }
        final C0710a c0710a = null;
        if (z && z2) {
            try {
                bVar = null;
                c0710a = new C0710a(aVar);
            } catch (Throwable th) {
                bVar = new c(str2, "predictor create failed, e = " + th.toString());
            }
        } else if (!z) {
            bVar = new com.sankuai.waimai.alita.core.mlmodel.predictor.exception.a(str, "model file is not valid");
        } else {
            bVar = new com.sankuai.waimai.alita.core.mlmodel.predictor.exception.b(str2, ModelConfig.ModelFileType.TYPE_ALITA_JS, "model type is not matched");
        }
        if (c0710a == null) {
            if (bVar != null) {
                aVar2.a(bVar);
                return;
            }
            aVar2.a(new Exception("create tflite predictor failed, isModelFileValid = " + z + ", isModelTypeMatched = " + z2));
            return;
        }
        final com.sankuai.waimai.alita.core.engine.h hVar = new com.sankuai.waimai.alita.core.engine.h() { // from class: com.sankuai.waimai.alita.core.mlmodel.predictor.xgb.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.core.engine.h
            public final void a(@Nullable String str3, @Nullable AlitaJSValue alitaJSValue) {
                Object[] objArr2 = {str3, alitaJSValue};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9970b8787d2ad0baa5b869fb017f961", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9970b8787d2ad0baa5b869fb017f961");
                } else {
                    aVar2.a(c0710a);
                }
            }

            @Override // com.sankuai.waimai.alita.core.engine.h
            public final void a(@Nullable Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4fe78e60b577d7a147bc82bf3c5aa188", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4fe78e60b577d7a147bc82bf3c5aa188");
                } else {
                    aVar2.a(exc);
                }
            }
        };
        Object[] objArr2 = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = C0710a.b;
        if (PatchProxy.isSupport(objArr2, c0710a, changeQuickRedirect2, false, "640dbccb5a1e98101f43aebebd5af37d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, c0710a, changeQuickRedirect2, false, "640dbccb5a1e98101f43aebebd5af37d");
        } else if (c0710a.c != null) {
            b.a().a(c0710a.c, new com.sankuai.waimai.alita.core.engine.h() { // from class: com.sankuai.waimai.alita.core.mlmodel.predictor.xgb.a.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.core.engine.h
                public final void a(@Nullable String str3, @Nullable AlitaJSValue alitaJSValue) {
                    Object[] objArr3 = {str3, alitaJSValue};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cbd982cd6e1cd5d37b2fd0881cd9775a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cbd982cd6e1cd5d37b2fd0881cd9775a");
                        return;
                    }
                    C0710a.this.d = str3;
                    if (hVar != null) {
                        hVar.a(str3, alitaJSValue);
                    }
                }

                @Override // com.sankuai.waimai.alita.core.engine.h
                public final void a(@Nullable Exception exc) {
                    Object[] objArr3 = {exc};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "540c3ff7a356a92377cb87b91a350782", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "540c3ff7a356a92377cb87b91a350782");
                        return;
                    }
                    C0710a.this.d = "";
                    if (hVar != null) {
                        hVar.a(exc);
                    }
                }
            });
        } else {
            hVar.a(new Exception("bundle is null"));
        }
    }
}
