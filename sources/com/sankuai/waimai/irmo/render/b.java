package com.sankuai.waimai.irmo.render;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.resource.APKStructure;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.render.a;
import com.sankuai.waimai.irmo.render.bean.assets.IrmoAssetGroup;
import com.sankuai.waimai.irmo.render.bean.assets.IrmoAssetInfo;
import com.sankuai.waimai.irmo.render.bean.layers.IrmoLayerGroup;
import com.sankuai.waimai.irmo.render.bean.layers.IrmoLayerInfo;
import com.sankuai.waimai.irmo.render.load.IrmoResDownloader;
import com.sankuai.waimai.irmo.resource.bean.IrmoResource;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.irmo.render.a b;
    @NonNull
    IrmoResDownloader c;
    @NonNull
    public IrmoLayerGroup d;
    a e;
    i f;
    @NonNull
    private IrmoAssetGroup g;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(@NonNull IrmoLayerGroup irmoLayerGroup);
    }

    public static /* synthetic */ void a(b bVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "b7f382020509ece07fd1607e8d0ca5da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "b7f382020509ece07fd1607e8d0ca5da");
            return;
        }
        List<IrmoLayerInfo> layers = bVar.d.getLayers();
        List<IrmoAssetInfo> assets = bVar.g.getAssets();
        for (IrmoLayerInfo irmoLayerInfo : layers) {
            irmoLayerInfo.setAssetRootPath(str);
            irmoLayerInfo.associateDependentAsset(assets);
        }
        IrmoLayerGroup irmoLayerGroup = bVar.d;
        Object[] objArr2 = {irmoLayerGroup};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "05d297f43e4c7bd1677400c72a0d401d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "05d297f43e4c7bd1677400c72a0d401d");
        } else if (bVar.e != null) {
            bVar.e.a(irmoLayerGroup);
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c74b71071fa7ff1cfde964d67ad1956c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c74b71071fa7ff1cfde964d67ad1956c");
            return;
        }
        this.c = new IrmoResDownloader();
        this.g = new IrmoAssetGroup();
        this.d = new IrmoLayerGroup();
    }

    public final void a(@NonNull String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ab7b658b62ed47793195f80a636ae21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ab7b658b62ed47793195f80a636ae21");
            return;
        }
        if (this.f != null) {
            this.f.b = str2;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("asset_bundle_id");
            if (this.f != null) {
                this.f.c = optString;
            }
            if (!this.g.parse(jSONObject.optJSONArray(APKStructure.Assets_Type))) {
                a(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_WEB_EVENT);
            } else if (!this.d.parse(jSONObject.getJSONArray("layers"))) {
                a(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_WEB_EVENT);
            } else {
                Object[] objArr2 = {optString};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "683a33374c1085b67e2bf05065cc51ca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "683a33374c1085b67e2bf05065cc51ca");
                } else {
                    com.sankuai.waimai.irmo.resource.a.a().a(optString, new com.sankuai.waimai.irmo.resource.api.a() { // from class: com.sankuai.waimai.irmo.render.b.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.irmo.resource.api.a
                        public final void a(@Nullable IrmoResource irmoResource) {
                            Object[] objArr3 = {irmoResource};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d3f6d5b1e596528cd9f3664444ff9e66", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d3f6d5b1e596528cd9f3664444ff9e66");
                            } else if (irmoResource == null || TextUtils.isEmpty(irmoResource.rootPath)) {
                                b.a(b.this, (String) null);
                            } else {
                                b.a(b.this, irmoResource.rootPath);
                            }
                        }

                        @Override // com.sankuai.waimai.irmo.resource.api.a
                        public final void a(int i, @Nullable Exception exc) {
                            Object[] objArr3 = {Integer.valueOf(i), exc};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1b1cc70ffefbe885283b77c015a478c3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1b1cc70ffefbe885283b77c015a478c3");
                            } else {
                                b.a(b.this, (String) null);
                            }
                        }
                    });
                }
            }
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a("IrmoComposition_Irmo", "parse dsl fail", e);
            a(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_WEB_EVENT);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d49247d20b1eb4c1c1e90807ba33b25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d49247d20b1eb4c1c1e90807ba33b25");
            return;
        }
        if (this.b != null) {
            this.b.a(a.EnumC0973a.effect_failed, null);
        }
        if (this.f != null) {
            this.f.a(false, i);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10563cd60ab52b71caae304aeeb0e397", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10563cd60ab52b71caae304aeeb0e397");
            return;
        }
        this.c = new IrmoResDownloader();
        this.g = new IrmoAssetGroup();
        this.d = new IrmoLayerGroup();
    }
}
