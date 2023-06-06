package com.sankuai.xm.imui.session.view.menu;

import android.content.Context;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.session.b;
import com.sankuai.xm.imui.session.entity.SessionParams;
import com.sankuai.xm.imui.session.view.MsgViewType;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.imui.session.view.menu.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC1403a {
        boolean a(DialogInterface dialogInterface, int i, IMMessage iMMessage);
    }

    public static boolean a(Context context, IMMessage iMMessage) {
        Object[] objArr = {context, iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d00949e2568d77fd7f8805ecfd4b7de6", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d00949e2568d77fd7f8805ecfd4b7de6")).booleanValue();
        }
        b b = b.b(context);
        if (iMMessage == null || iMMessage.getMsgStatus() == 4 || iMMessage.getCategory() != 2 || iMMessage.getMsgType() == 12 || iMMessage.getMsgType() == 100 || iMMessage.getMsgId() == 0 || b == null || !b.f()) {
            d.b("MenuUtils::adminCancelable: not available for msg: " + iMMessage.keyParamToString(), new Object[0]);
            return false;
        }
        SessionParams sessionParams = b.c;
        if (sessionParams != null && sessionParams.g) {
            return Math.abs(IMClient.a().h().a(System.currentTimeMillis()) - iMMessage.getSts()) <= (sessionParams.h > 0 ? sessionParams.h : 604800000L);
        }
        d.b("MenuUtils::adminCancelable: not enabled", new Object[0]);
        return false;
    }

    public static boolean b(Context context, IMMessage iMMessage) {
        SessionParams sessionParams;
        Object[] objArr = {context, iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c2ca99b23b950a7162718f761a041ca", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c2ca99b23b950a7162718f761a041ca")).booleanValue();
        }
        if (iMMessage.getMsgStatus() == 4 || iMMessage.getFromUid() != IMUIManager.a().e() || iMMessage.getMsgId() == 0 || iMMessage.getMsgType() == 12 || iMMessage.getMsgType() == 100) {
            d.b("MenuUtils::selfCancelable: not available", new Object[0]);
            return false;
        }
        long abs = Math.abs(IMClient.a().h().a(System.currentTimeMillis()) - iMMessage.getSts());
        long j = 600000;
        b b = b.b(context);
        if (b != null && (sessionParams = b.c) != null && sessionParams.f > 0) {
            j = sessionParams.f;
        }
        return abs <= j;
    }

    public static boolean c(Context context, IMMessage iMMessage) {
        Object[] objArr = {context, iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76804efb34233f2ed6d08d0922d6d7c5", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76804efb34233f2ed6d08d0922d6d7c5")).booleanValue();
        }
        if (SessionParams.a(context).r) {
            d.b("MenuUtils::forwardable: not available", new Object[0]);
            return false;
        }
        int[] b = SessionParams.a(context).b();
        if (b.length != 0) {
            return Arrays.binarySearch(b, iMMessage.getMsgType()) >= 0;
        }
        d.c("MenuUtils::forwardable: not supported", new Object[0]);
        return false;
    }

    public static boolean d(Context context, IMMessage iMMessage) {
        Object[] objArr = {context, iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8505cb5c2a5db0093199915e6de15d0", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8505cb5c2a5db0093199915e6de15d0")).booleanValue();
        }
        if (SessionParams.a(context).r) {
            d.b("MenuUtils::multiSelectable: not available", new Object[0]);
            return false;
        }
        int[] c = SessionParams.a(context).c();
        if (c.length == 0) {
            d.b("MenuUtils::multiSelectable: not supported", new Object[0]);
            return false;
        }
        int a2 = MsgViewType.a(iMMessage);
        if (a2 != 20 && a2 != 21) {
            return Arrays.binarySearch(c, iMMessage.getMsgType()) >= 0 && !b.b(context).e();
        }
        d.b("MenuUtils::multiSelectable: not supported for type %s", Integer.valueOf(a2));
        return false;
    }
}
