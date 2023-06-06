package com.meituan.mmp.lib.api.canvas.impl;

import android.graphics.Canvas;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class w implements com.meituan.mmp.lib.api.canvas.e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final String a() {
        return "setFontStyle";
    }

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final boolean a(com.meituan.mmp.lib.api.canvas.i iVar, Canvas canvas, JSONArray jSONArray) {
        Object[] objArr = {iVar, canvas, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fe5d75d68e4b22f49dba4f4e454a70e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fe5d75d68e4b22f49dba4f4e454a70e")).booleanValue();
        }
        if (jSONArray.length() == 0) {
            return false;
        }
        try {
            String string = jSONArray.getString(0);
            char c = 65535;
            int hashCode = string.hashCode();
            if (hashCode != -1657669071) {
                if (hashCode != -1178781136) {
                    if (hashCode == -1039745817 && string.equals("normal")) {
                        c = 2;
                    }
                } else if (string.equals(DynamicTitleParser.PARSER_VAL_FONT_STYLE_ITALIC)) {
                    c = 1;
                }
            } else if (string.equals("oblique")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    iVar.c.a(2);
                    iVar.d.a(2);
                    return true;
                case 1:
                    iVar.c.a(2);
                    iVar.d.a(2);
                    return true;
                case 2:
                    iVar.c.a(0);
                    iVar.d.a(0);
                    return true;
                default:
                    return false;
            }
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }
}
