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
public final class x implements com.meituan.mmp.lib.api.canvas.e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final String a() {
        return "setFontWeight";
    }

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final boolean a(com.meituan.mmp.lib.api.canvas.i iVar, Canvas canvas, JSONArray jSONArray) {
        Object[] objArr = {iVar, canvas, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7878f2451b6ed7afe7ecb5b020aef59", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7878f2451b6ed7afe7ecb5b020aef59")).booleanValue();
        }
        if (jSONArray.length() == 0) {
            return false;
        }
        try {
            String string = jSONArray.getString(0);
            char c = 65535;
            int hashCode = string.hashCode();
            if (hashCode != -1039745817) {
                if (hashCode == 3029637 && string.equals(DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD)) {
                    c = 1;
                }
            } else if (string.equals("normal")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    iVar.c.setFakeBoldText(false);
                    iVar.d.setFakeBoldText(false);
                    break;
                case 1:
                    iVar.c.setFakeBoldText(true);
                    iVar.d.setFakeBoldText(true);
                    break;
            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }
}
