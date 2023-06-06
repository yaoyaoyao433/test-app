package com.meituan.msi.api.component.canvas.imp;

import android.graphics.Canvas;
import com.dianping.titans.widget.DynamicTitleParser;
import com.google.gson.JsonArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class x implements ak {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final String a() {
        return "setFontWeight";
    }

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final boolean a(com.meituan.msi.api.component.canvas.f fVar, Canvas canvas, JsonArray jsonArray) {
        Object[] objArr = {fVar, canvas, jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74edf8ceba9ad44f7e9c10523ae7dfce", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74edf8ceba9ad44f7e9c10523ae7dfce")).booleanValue();
        }
        if (jsonArray.size() == 0) {
            return false;
        }
        String asString = jsonArray.get(0).getAsString();
        char c = 65535;
        int hashCode = asString.hashCode();
        if (hashCode != -1039745817) {
            if (hashCode == 3029637 && asString.equals(DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD)) {
                c = 1;
            }
        } else if (asString.equals("normal")) {
            c = 0;
        }
        switch (c) {
            case 0:
                fVar.b.setFakeBoldText(false);
                fVar.c.setFakeBoldText(false);
                break;
            case 1:
                fVar.b.setFakeBoldText(true);
                fVar.c.setFakeBoldText(true);
                break;
        }
        return true;
    }
}
