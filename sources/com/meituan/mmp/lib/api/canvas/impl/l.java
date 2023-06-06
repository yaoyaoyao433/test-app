package com.meituan.mmp.lib.api.canvas.impl;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l implements com.meituan.mmp.lib.api.canvas.e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final String a() {
        return "setGlobalCompositeOperation";
    }

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final boolean a(com.meituan.mmp.lib.api.canvas.i iVar, Canvas canvas, JSONArray jSONArray) {
        char c = 3;
        Object[] objArr = {iVar, canvas, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a723e4aa2b41bf62f71ce9b3778b2ac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a723e4aa2b41bf62f71ce9b3778b2ac")).booleanValue();
        }
        if (jSONArray.length() <= 0) {
            return false;
        }
        try {
            com.meituan.mmp.lib.api.canvas.j jVar = iVar.d;
            String string = jSONArray.getString(0);
            switch (string.hashCode()) {
                case -2120744511:
                    if (string.equals("luminosity")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1763725041:
                    if (string.equals("destination-out")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1698458601:
                    if (string.equals("source-in")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1427739212:
                    if (string.equals("hard-light")) {
                        break;
                    }
                    c = 65535;
                    break;
                case -1338968417:
                    if (string.equals("darken")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1247677005:
                    if (string.equals("soft-light")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1112602980:
                    if (string.equals("source-out")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1091287984:
                    if (string.equals("overlay")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -230491182:
                    if (string.equals("saturation")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -131372090:
                    if (string.equals("source-atop")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -130953402:
                    if (string.equals("source-over")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -120580883:
                    if (string.equals("color-dodge")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 103672:
                    if (string.equals("hue")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 118875:
                    if (string.equals("xor")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 3059573:
                    if (string.equals("copy")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 94842723:
                    if (string.equals("color")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 170546239:
                    if (string.equals("lighten")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 170546243:
                    if (string.equals("lighter")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 653829668:
                    if (string.equals("multiply")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 912936772:
                    if (string.equals("destination-in")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 1158680499:
                    if (string.equals("destination-atop")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 1159099187:
                    if (string.equals("destination-over")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 1242982905:
                    if (string.equals("color-burn")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 1686617550:
                    if (string.equals("exclusion")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 1728361789:
                    if (string.equals("difference")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 1:
                    jVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    break;
                case 2:
                    jVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    break;
                case 3:
                    jVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
                    break;
                case 4:
                    jVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));
                    break;
                case 5:
                    jVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
                    break;
                case 6:
                    jVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
                    break;
                case 7:
                    jVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
                    break;
                case '\t':
                    jVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
                    break;
                case '\n':
                    jVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
                    break;
                case '\r':
                    jVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
                    break;
                case 14:
                    jVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.ADD));
                    break;
                case 16:
                    jVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
                    break;
                case 17:
                    jVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
                    break;
                case 18:
                    jVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
                    break;
                case 19:
                    jVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                    break;
                case 20:
                    jVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
                    break;
                case 21:
                    jVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                    break;
                case 22:
                    jVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
                    break;
                case 23:
                    jVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
                    break;
                case 24:
                    jVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));
                    break;
            }
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }
}
