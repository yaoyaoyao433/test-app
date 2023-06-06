package com.sankuai.waimai.alita.core.feature.js;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.base.util.AlitaBundleUtil;
import com.sankuai.waimai.alita.core.engine.b;
import com.sankuai.waimai.alita.core.engine.h;
import com.sankuai.waimai.alita.core.feature.e;
import com.sankuai.waimai.alita.core.feature.f;
import com.sankuai.waimai.alita.core.jsexecutor.AlitaJSValue;
import com.sankuai.waimai.alita.core.utils.c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.alita.core.feature.a {
    public static ChangeQuickRedirect b;
    com.sankuai.waimai.alita.bundle.model.a c;

    public a(com.sankuai.waimai.alita.bundle.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49f79180100524564022a68727e9b6bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49f79180100524564022a68727e9b6bc");
        } else {
            this.c = aVar;
        }
    }

    @Override // com.sankuai.waimai.alita.core.feature.a, com.sankuai.waimai.alita.core.feature.h
    public final List<String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d59477163b6aebae1624578e9ee8c6aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d59477163b6aebae1624578e9ee8c6aa");
        }
        if (this.c == null || this.c.g == null) {
            return null;
        }
        String str = this.c.g.c;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return arrayList;
    }

    @Override // com.sankuai.waimai.alita.core.feature.h
    public final void a(@NonNull final String str, final List<JSONObject> list, @Nullable final f fVar) {
        Object[] objArr = {str, list, fVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3e5633fdc8a1c1f4ebf47b156b644b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3e5633fdc8a1c1f4ebf47b156b644b3");
            return;
        }
        c.a("JSFeatureProducer.produceFeatureTable(): loadScript : bundle = " + this.c.c);
        b.a().a(this.c, new h() { // from class: com.sankuai.waimai.alita.core.feature.js.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.core.engine.h
            public final void a(@Nullable final String str2, @Nullable AlitaJSValue alitaJSValue) {
                Object[] objArr2 = {str2, alitaJSValue};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7332c1a0da82168248cdd3b2ed88885d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7332c1a0da82168248cdd3b2ed88885d");
                } else if (!TextUtils.isEmpty(str2)) {
                    c.a("JSFeatureProducer.produceFeatureTable(): runTask : bundle = " + a.this.c.c + ", taskKey = " + str2 + ", arg[0] = " + ((JSONObject) list.get(0)).toString());
                    b.a().a(str2, list, new h() { // from class: com.sankuai.waimai.alita.core.feature.js.a.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.alita.core.engine.h
                        public final void a(@Nullable String str3, @Nullable AlitaJSValue alitaJSValue2) {
                            Object[] objArr3 = {str3, alitaJSValue2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "344ae745076c6170af6cbf2cde84fb21", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "344ae745076c6170af6cbf2cde84fb21");
                                return;
                            }
                            StringBuilder sb = new StringBuilder("JSFeatureProducer.produceFeatureTable.runTask.onSuccess(): runTask success : bundle = ");
                            sb.append(a.this.c.c);
                            sb.append(", taskKey = ");
                            sb.append(str3);
                            sb.append(", result = ");
                            sb.append(alitaJSValue2 != null ? alitaJSValue2.stringValue() : StringUtil.NULL);
                            c.a(sb.toString());
                            if (alitaJSValue2 != null) {
                                try {
                                    e a2 = e.a(AlitaBundleUtil.a(a.this.c.c), str, new JSONObject(alitaJSValue2.stringValue()).optJSONObject("data"));
                                    if (a2 != null) {
                                        com.sankuai.waimai.alita.core.base.util.a.a(fVar, a2.d);
                                        return;
                                    } else {
                                        com.sankuai.waimai.alita.core.base.util.a.a(fVar, new Exception("result has no features"));
                                        return;
                                    }
                                } catch (Exception unused) {
                                    com.sankuai.waimai.alita.core.base.util.a.a(fVar, new Exception("result is not json"));
                                    return;
                                }
                            }
                            com.sankuai.waimai.alita.core.base.util.a.a(fVar, new Exception("result is null"));
                        }

                        @Override // com.sankuai.waimai.alita.core.engine.h
                        public final void a(@Nullable Exception exc) {
                            Object[] objArr3 = {exc};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "28f089b34ebc7e379cbe56376b1df01f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "28f089b34ebc7e379cbe56376b1df01f");
                                return;
                            }
                            StringBuilder sb = new StringBuilder("JSFeatureProducer.produceFeatureTable.runTask.onFailed(): runTask failed : bundle = ");
                            sb.append(a.this.c.c);
                            sb.append(", taskKey = ");
                            sb.append(str2);
                            sb.append(", e = ");
                            sb.append(exc != null ? exc.toString() : StringUtil.NULL);
                            c.a(sb.toString());
                            com.sankuai.waimai.alita.core.base.util.a.a(fVar, exc);
                        }
                    });
                } else {
                    com.sankuai.waimai.alita.core.base.util.a.a(fVar, new Exception("taskKey is empty"));
                }
            }

            @Override // com.sankuai.waimai.alita.core.engine.h
            public final void a(@Nullable Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c7ee44997ad4f776a355b157b2c511d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c7ee44997ad4f776a355b157b2c511d");
                    return;
                }
                StringBuilder sb = new StringBuilder("JSFeatureProducer.produceFeatureTable.loadScript.onFailed(): loadScript failed : bundle = ");
                sb.append(a.this.c.c);
                sb.append(", e = ");
                sb.append(exc != null ? exc.toString() : StringUtil.NULL);
                c.a(sb.toString());
                com.sankuai.waimai.alita.core.base.util.a.a(fVar, exc);
            }
        });
    }
}
