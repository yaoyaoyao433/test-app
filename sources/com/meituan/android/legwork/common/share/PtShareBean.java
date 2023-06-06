package com.meituan.android.legwork.common.share;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class PtShareBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SuppressLint({"SerializableCheck"})
    public Bitmap bmp;
    public int channel;
    public String cid;
    public String content;
    public String imgUrl;
    public String miniProgramId;
    public String miniProgramPath;
    public String title;
    public String url;

    public PtShareBean() {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        private int i;
        private Bitmap j;

        public a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c14423bd7fc7905a7ec565f767927c88", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c14423bd7fc7905a7ec565f767927c88");
            } else {
                this.i = i;
            }
        }

        public final PtShareBean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8e65e245f9a4c150edeebd464511b9a", RobustBitConfig.DEFAULT_VALUE)) {
                return (PtShareBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8e65e245f9a4c150edeebd464511b9a");
            }
            PtShareBean ptShareBean = new PtShareBean();
            ptShareBean.channel = this.i;
            ptShareBean.title = this.b;
            ptShareBean.content = this.c;
            ptShareBean.url = this.d;
            ptShareBean.imgUrl = this.e;
            ptShareBean.miniProgramPath = this.f;
            ptShareBean.miniProgramId = this.g;
            ptShareBean.bmp = this.j;
            ptShareBean.cid = this.h;
            return ptShareBean;
        }
    }
}
