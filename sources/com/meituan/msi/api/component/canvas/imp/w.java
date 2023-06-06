package com.meituan.msi.api.component.canvas.imp;

import android.graphics.Canvas;
import com.dianping.titans.widget.DynamicTitleParser;
import com.google.gson.JsonArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class w implements ak {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final String a() {
        return "setFontStyle";
    }

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final boolean a(com.meituan.msi.api.component.canvas.f fVar, Canvas canvas, JsonArray jsonArray) {
        Object[] objArr = {fVar, canvas, jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f6f40d9cee1b5dd6e92153645184433", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f6f40d9cee1b5dd6e92153645184433")).booleanValue();
        }
        if (jsonArray.size() == 0) {
            return false;
        }
        String asString = jsonArray.get(0).getAsString();
        char c = 65535;
        int hashCode = asString.hashCode();
        if (hashCode != -1657669071) {
            if (hashCode != -1178781136) {
                if (hashCode == -1039745817 && asString.equals("normal")) {
                    c = 2;
                }
            } else if (asString.equals(DynamicTitleParser.PARSER_VAL_FONT_STYLE_ITALIC)) {
                c = 1;
            }
        } else if (asString.equals("oblique")) {
            c = 0;
        }
        switch (c) {
            case 0:
            case 1:
                fVar.b.a(2);
                fVar.c.a(2);
                return true;
            case 2:
                fVar.b.a(0);
                fVar.c.a(0);
                return true;
            default:
                return false;
        }
    }
}
