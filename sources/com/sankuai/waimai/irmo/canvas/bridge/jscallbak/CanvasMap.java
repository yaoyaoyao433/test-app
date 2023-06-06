package com.sankuai.waimai.irmo.canvas.bridge.jscallbak;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.canvas.data.d;
import java.util.HashMap;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class CanvasMap extends d {
    private static final String TAG = "INFCanvasMap";
    public static ChangeQuickRedirect changeQuickRedirect;

    public CanvasMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0fb9f9fe462f1b13d5f1defa5a4e7a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0fb9f9fe462f1b13d5f1defa5a4e7a6");
            return;
        }
        this.mPropertiesMap = new HashMap();
        this.mProperties = new CanvasArray();
    }

    public CanvasMap(CanvasArray canvasArray) {
        this();
        Object[] objArr = {canvasArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d270fc30d78cf773a456d6c5f6bcf511", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d270fc30d78cf773a456d6c5f6bcf511");
            return;
        }
        this.mProperties = canvasArray;
        for (int i = 0; i < this.mProperties.size(); i += 2) {
            this.mPropertiesMap.put(this.mProperties.get(i).toString(), this.mProperties.get(i + 1));
        }
    }

    private CanvasArray getProperties() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c6034b1a61acc5e64a7a6df921157d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (CanvasArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c6034b1a61acc5e64a7a6df921157d0");
        }
        if (this.mProperties instanceof CanvasArray) {
            return (CanvasArray) this.mProperties;
        }
        com.sankuai.waimai.irmo.utils.d.e("array type error in map", new Object[0]);
        return null;
    }
}
