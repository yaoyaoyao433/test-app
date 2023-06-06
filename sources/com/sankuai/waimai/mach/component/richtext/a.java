package com.sankuai.waimai.mach.component.richtext;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.mach.component.richtext.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1004a {
        Drawable a(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
    }

    @Deprecated
    public static Spanned a(@NonNull Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a5c688150e0c0b63aa97f3a5ca7d2d8", RobustBitConfig.DEFAULT_VALUE) ? (Spanned) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a5c688150e0c0b63aa97f3a5ca7d2d8") : a(context, str, 0, null, null);
    }

    private static Spanned a(@NonNull Context context, String str, int i, InterfaceC1004a interfaceC1004a, b bVar) {
        Object[] objArr = {context, str, 0, null, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "375f5cfbaaea9566189e3d744fa81ade", RobustBitConfig.DEFAULT_VALUE)) {
            return (Spanned) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "375f5cfbaaea9566189e3d744fa81ade");
        }
        try {
            SAXParser newSAXParser = SAXParserFactory.newInstance().newSAXParser();
            return new com.sankuai.waimai.mach.component.richtext.b(context, "<root>" + str + "</root>", null, null, newSAXParser, 0).a();
        } catch (ParserConfigurationException | SAXException unused) {
            return new SpannableStringBuilder();
        } catch (Exception e) {
            e.printStackTrace();
            return new SpannableStringBuilder();
        }
    }
}
