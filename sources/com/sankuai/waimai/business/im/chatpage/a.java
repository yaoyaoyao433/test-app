package com.sankuai.waimai.business.im.chatpage;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.utils.d;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
import com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a implements c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.business.im.chatpage.c
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.sankuai.waimai.business.im.chatpage.c
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d4fe33fe0df62a947caceae04ee5c43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d4fe33fe0df62a947caceae04ee5c43");
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.c
    public void a(int i, IMMessage iMMessage) {
    }

    @Override // com.sankuai.waimai.business.im.chatpage.c
    public void a(int i, String str, List<com.sankuai.xm.imui.session.entity.b> list, int i2, boolean z) {
    }

    @Override // com.sankuai.waimai.business.im.chatpage.c
    public void a(long j) {
    }

    @Override // com.sankuai.waimai.business.im.chatpage.c
    public void a(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb40921013e964aa648cc12077b1a632", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb40921013e964aa648cc12077b1a632");
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.c
    public void a(d.a aVar) {
    }

    @Override // com.sankuai.waimai.business.im.chatpage.c
    public void a(IMMessage iMMessage) {
    }

    @Override // com.sankuai.waimai.business.im.chatpage.c
    public boolean a(com.sankuai.xm.imui.session.entity.b bVar) {
        return false;
    }

    @Override // com.sankuai.waimai.business.im.chatpage.c
    public void a_(long j) {
    }

    @Override // com.sankuai.waimai.business.im.chatpage.c
    public void al_() {
    }

    public void am_() {
    }

    @Override // com.sankuai.waimai.business.im.chatpage.c
    public void an_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b5c03f90f404d8da37f2010b0240d2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b5c03f90f404d8da37f2010b0240d2c");
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.c
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f0f1618b4e8e93e738c886a4cc33235", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f0f1618b4e8e93e738c886a4cc33235");
        }
    }

    public void b(IMMessage iMMessage) {
    }

    @Override // com.sankuai.waimai.business.im.chatpage.c
    public ISendPanelAdapter bq_() {
        return null;
    }

    @Override // com.sankuai.waimai.business.im.chatpage.c
    public void br_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36011d5aabc64ebea178e6bf68349df0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36011d5aabc64ebea178e6bf68349df0");
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.c
    public void bs_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41ac3e2ffc56f148af1fe3550fa118f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41ac3e2ffc56f148af1fe3550fa118f8");
        }
    }

    @Override // com.sankuai.waimai.business.im.chatpage.c
    public boolean d() {
        return false;
    }

    @Override // com.sankuai.waimai.business.im.chatpage.c
    public IMsgViewAdapter e() {
        return null;
    }

    @Override // com.sankuai.waimai.business.im.chatpage.c
    public TitleBarAdapter g() {
        return null;
    }

    public long i() {
        return 0L;
    }

    @Override // com.sankuai.waimai.business.im.chatpage.c
    public void k() {
    }

    @Override // com.sankuai.waimai.business.im.chatpage.c
    public boolean n() {
        return true;
    }
}
