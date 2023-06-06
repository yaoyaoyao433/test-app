package com.sankuai.waimai.alita.core.mlmodel.predictor;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.mlmodel.predictor.f;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b b;
    private com.sankuai.waimai.alita.core.base.g<String, a> c;

    public static /* synthetic */ void a(b bVar, Executor executor, final f.a aVar, final com.sankuai.waimai.alita.core.mlmodel.predictor.base.b bVar2) {
        Object[] objArr = {executor, aVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "dbb009561acc06dae2d49b0b0fe5f842", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "dbb009561acc06dae2d49b0b0fe5f842");
        } else if (aVar != null) {
            com.sankuai.waimai.launcher.util.aop.b.a(executor, new Runnable() { // from class: com.sankuai.waimai.alita.core.mlmodel.predictor.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b772fc1dcae0d69cf54f7b8be0d11f5c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b772fc1dcae0d69cf54f7b8be0d11f5c");
                    } else {
                        aVar.a(bVar2);
                    }
                }
            });
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8269b3cc6eb54a19569d404a00f076cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8269b3cc6eb54a19569d404a00f076cb");
        } else {
            this.c = new com.sankuai.waimai.alita.core.base.g<>();
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79692a6b9fbc5654ad67566486cb4b74", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79692a6b9fbc5654ad67566486cb4b74");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    public final synchronized void a(@NonNull f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "548b5880ff2923313fef864874ec7c53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "548b5880ff2923313fef864874ec7c53");
        } else {
            this.c.a((com.sankuai.waimai.alita.core.base.g<String, a>) new a(fVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull Executor executor, @Nullable final f.a aVar, @Nullable final Exception exc) {
        Object[] objArr = {executor, aVar, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "121ea8c010cbd24da1dca57024558719", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "121ea8c010cbd24da1dca57024558719");
        } else if (aVar != null) {
            com.sankuai.waimai.launcher.util.aop.b.a(executor, new Runnable() { // from class: com.sankuai.waimai.alita.core.mlmodel.predictor.b.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "822b894bcb6a4fa92c8173db66df6ee3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "822b894bcb6a4fa92c8173db66df6ee3");
                    } else {
                        aVar.a(exc);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends com.sankuai.waimai.alita.core.base.c<f> {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.alita.core.base.c, com.sankuai.waimai.alita.core.base.f
        public final boolean a(String str) {
            List<String> a2;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beb89ddf85458988455a640dbf722305", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beb89ddf85458988455a640dbf722305")).booleanValue();
            }
            if (!TextUtils.isEmpty(str) && (a2 = ((f) this.d).a()) != null) {
                for (String str2 : a2) {
                    if (str2 != null && TextUtils.equals(str2, str)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public a(@NonNull f fVar) {
            super("", fVar);
            Object[] objArr = {fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8630732e81bb150a7008aa2c2f9ba47e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8630732e81bb150a7008aa2c2f9ba47e");
            }
        }
    }

    public final synchronized void a(@NonNull final Executor executor, @Nullable final com.sankuai.waimai.alita.bundle.model.a aVar, @Nullable final f.a aVar2) {
        Object[] objArr = {executor, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7964d2518543bb8308c86ab877856114", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7964d2518543bb8308c86ab877856114");
            return;
        }
        if (aVar != null && aVar.i != null && !TextUtils.isEmpty(aVar.i.getModelFileType())) {
            String modelFileType = aVar.i.getModelFileType();
            com.sankuai.waimai.alita.core.utils.c.a("AlitaModelPredictorManager.createPredictor(): bundle = " + a(aVar) + ", modelFileType = " + modelFileType);
            a a2 = this.c.a((com.sankuai.waimai.alita.core.base.g<String, a>) modelFileType);
            if (a2 != null) {
                ((f) a2.d).a(aVar, new f.a() { // from class: com.sankuai.waimai.alita.core.mlmodel.predictor.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.f.a
                    public final void a(@NonNull com.sankuai.waimai.alita.core.mlmodel.predictor.base.b bVar) {
                        Object[] objArr2 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26e87145a5a289458bff2ab2eaa9a221", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26e87145a5a289458bff2ab2eaa9a221");
                            return;
                        }
                        com.sankuai.waimai.alita.core.utils.c.a("AlitaModelPredictorManager.createPredictor(): success, bundle = " + b.this.a(aVar));
                        b.a(b.this, executor, aVar2, bVar);
                    }

                    @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.f.a
                    public final void a(@Nullable Exception exc) {
                        Object[] objArr2 = {exc};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f3f48b1f1176742f5661a45652a070a5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f3f48b1f1176742f5661a45652a070a5");
                            return;
                        }
                        com.sankuai.waimai.alita.core.utils.c.a("AlitaModelPredictorManager.createPredictor(): failed, bundle = " + b.this.a(aVar) + ", e = " + com.sankuai.waimai.alita.core.base.util.b.a(exc));
                        b.this.a(executor, aVar2, exc);
                    }
                });
            } else {
                com.sankuai.waimai.alita.core.utils.c.a("AlitaModelPredictorManager.createPredictor(): failed, bundle = " + a(aVar) + ", predictor producer not found");
                a(executor, aVar2, new Exception("create predictor failed: predictor producer not found"));
            }
        } else {
            com.sankuai.waimai.alita.core.utils.c.a("AlitaModelPredictorManager.createPredictor(): failed, bundle = " + a(aVar) + ", bundle has no modelFileType ");
            a(executor, aVar2, new Exception("create predictor failed: modelFileType not exist"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(@Nullable com.sankuai.waimai.alita.bundle.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b1346ba22157f311149ed8167ff4908", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b1346ba22157f311149ed8167ff4908") : aVar == null ? StringUtil.NULL : aVar.c;
    }
}
