package com.sankuai.waimai.irmo.mach.vap;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.render.bean.assets.IrmoAssetInfo;
import com.sankuai.waimai.irmo.render.bean.layers.IrmoLayerInfo;
import com.sankuai.waimai.irmo.render.bean.layers.VideoEffectParams;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends com.sankuai.waimai.irmo.mach.a {
    public static ChangeQuickRedirect k;
    public String l;
    public String m;
    public com.sankuai.waimai.mach.parser.d n;
    public String o;
    public String p;
    public String q;

    public e(@NonNull IrmoLayerInfo irmoLayerInfo) {
        super(irmoLayerInfo);
        Object[] objArr = {irmoLayerInfo};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba32410d1dc400a803757e012aa8ac82", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba32410d1dc400a803757e012aa8ac82");
            return;
        }
        VideoEffectParams videoEffectParams = irmoLayerInfo.effectParams instanceof VideoEffectParams ? (VideoEffectParams) irmoLayerInfo.effectParams : null;
        if (videoEffectParams == null) {
            return;
        }
        IrmoAssetInfo assetById = irmoLayerInfo.getAssetById(videoEffectParams.videoAssId);
        if (assetById != null) {
            this.p = a(irmoLayerInfo, assetById);
            this.m = assetById.url;
        }
        com.sankuai.waimai.irmo.utils.d.b("VideoBaseConfig_Irmo 视频本地路径 : " + this.p, new Object[0]);
        com.sankuai.waimai.irmo.utils.d.b("VideoBaseConfig_Irmo 视频链接: " + this.m, new Object[0]);
        IrmoAssetInfo assetById2 = irmoLayerInfo.getAssetById(videoEffectParams.errorAssId);
        this.o = a(irmoLayerInfo, assetById2);
        if (TextUtils.isEmpty(this.o) && assetById2 != null) {
            this.o = assetById2.url;
        }
        com.sankuai.waimai.irmo.utils.d.b("VideoBaseConfig_Irmo 错误图路径 : " + this.o, new Object[0]);
        IrmoAssetInfo assetById3 = irmoLayerInfo.getAssetById(videoEffectParams.firstFrameAssId);
        this.q = a(irmoLayerInfo, assetById3);
        if (TextUtils.isEmpty(this.q) && assetById3 != null) {
            this.q = assetById3.url;
        }
        com.sankuai.waimai.irmo.utils.d.b("VideoBaseConfig_Irmo 首帧图路径 : " + this.q, new Object[0]);
    }

    private String a(IrmoLayerInfo irmoLayerInfo, IrmoAssetInfo irmoAssetInfo) {
        Object[] objArr = {irmoLayerInfo, irmoAssetInfo};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d33f047f2917af39529f332e697c4da3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d33f047f2917af39529f332e697c4da3");
        }
        if (irmoLayerInfo == null || irmoAssetInfo == null || TextUtils.isEmpty(irmoLayerInfo.rootPath) || irmoAssetInfo == null || TextUtils.isEmpty(irmoAssetInfo.path)) {
            return "";
        }
        if (irmoAssetInfo.path.startsWith("/")) {
            return irmoLayerInfo.rootPath + irmoAssetInfo.path;
        }
        return irmoLayerInfo.rootPath + "/" + irmoAssetInfo.path;
    }

    public e(Map<String, Object> map) {
        super(map);
        Object obj;
        Object obj2;
        Object obj3;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "394744d80adc1fb0f8e52fdebe0006e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "394744d80adc1fb0f8e52fdebe0006e8");
        } else if (map == null) {
        } else {
            if (map.containsKey("vap-url") && (obj3 = map.get("vap-url")) != null) {
                this.m = obj3.toString();
            }
            if (map.containsKey("config-url") && (obj2 = map.get("config-url")) != null) {
                this.l = obj2.toString();
            }
            if (map.containsKey("error") && (obj = map.get("error")) != null) {
                this.o = obj.toString();
            }
            Object obj4 = map.get("@vap-callback");
            if (obj4 instanceof com.sankuai.waimai.mach.parser.d) {
                this.n = (com.sankuai.waimai.mach.parser.d) obj4;
            }
        }
    }
}
