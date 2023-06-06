package com.sankuai.waimai.business.ugc.live;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.dianping.live.card.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.ugc.live.a;
import com.sankuai.waimai.business.ugc.live.utils.c;
import com.sankuai.waimai.business.ugc.live.utils.d;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c extends FrameLayout implements a.b {
    public static ChangeQuickRedirect a = null;
    private static final String c = "c";
    public volatile int b;
    private com.sankuai.waimai.business.ugc.live.a d;
    private b e;
    private com.sankuai.waimai.business.ugc.live.utils.a f;
    private a g;
    private long h;
    private boolean i;
    private boolean j;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i);

        void a(int i, long j);

        void c();

        void d();

        void e();
    }

    public c(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "047d43bdbcd0891a50072e0a5e227140", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "047d43bdbcd0891a50072e0a5e227140");
        } else {
            this.b = 0;
        }
    }

    public final boolean a() {
        return this.b > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.sankuai.waimai.business.ugc.live.c.b r22, com.sankuai.waimai.business.ugc.live.c.a r23) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.ugc.live.c.a(com.sankuai.waimai.business.ugc.live.c$b, com.sankuai.waimai.business.ugc.live.c$a):void");
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea41152d325a350fb673b660d8f873d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea41152d325a350fb673b660d8f873d2");
            return;
        }
        d.a(d.c + "rePlay");
        this.h = System.currentTimeMillis();
        this.i = false;
        this.j = false;
        if (this.d != null) {
            this.d.a(context);
            this.d.b(this);
            this.d.a(b.a(this.e));
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d283f5f2f8d1f89b3f6dc05af264b83a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d283f5f2f8d1f89b3f6dc05af264b83a");
            return;
        }
        d.a(d.c + "pause");
        if (this.d != null) {
            this.d.d();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fa7b5f1d73a838694974b162dd29673", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fa7b5f1d73a838694974b162dd29673");
            return;
        }
        d.a(d.c + "resume");
        if (this.d != null) {
            this.d.e();
        }
    }

    public final void a(b bVar) {
        boolean z = true;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ded961756e456db61896dd1f337662ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ded961756e456db61896dd1f337662ad");
            return;
        }
        d.a(d.c + "stop");
        if (this.d != null) {
            com.sankuai.waimai.business.ugc.live.a aVar = this.d;
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.ugc.live.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "f313ecb1262d61551273fc5904fcbfbc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "f313ecb1262d61551273fc5904fcbfbc");
            } else {
                aVar.d.remove(this);
            }
            com.sankuai.waimai.business.ugc.live.a aVar2 = this.d;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.ugc.live.a.a;
            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "6d09d02374023288b6e51111dd42d3a8", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "6d09d02374023288b6e51111dd42d3a8")).booleanValue();
            } else if (aVar2.d.size() <= 0) {
                z = false;
            }
            if (z) {
                return;
            }
            this.d.d();
            this.d.f();
            com.sankuai.waimai.business.ugc.live.b.a().a(bVar.l);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "333fefd276437d190ccf53fc1fb5202e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "333fefd276437d190ccf53fc1fb5202e");
            return;
        }
        d.a(d.c + "mute");
        this.e.i = z;
        if (this.d != null) {
            this.d.a(z);
            if (z) {
                return;
            }
            d();
        }
    }

    public final void b(b bVar, a aVar) {
        Object[] objArr = {bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "290ef5d44ecf7d47dacc6772aa10681b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "290ef5d44ecf7d47dacc6772aa10681b");
            return;
        }
        d.a(d.c + "shareAchieve");
        this.e = bVar;
        this.g = aVar;
        if (this.d == null) {
            this.d = com.sankuai.waimai.business.ugc.live.b.a().a(getContext(), bVar.l);
        }
        if (this.d != null) {
            this.h = System.currentTimeMillis();
            this.d.a((a.b) this);
            this.d.b(this);
        }
    }

    @Override // com.sankuai.waimai.business.ugc.live.a.b
    public void onPlayException(int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ebb770a5f5b11db0f3346755a9b6754", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ebb770a5f5b11db0f3346755a9b6754");
            return;
        }
        d.a(d.c + "onPlayException");
        if (i == -2301 || i == -2302 || i == -2303 || i == -2304 || i == -2305 || i == -2306 || i == -2307) {
            if (e()) {
                c.a aVar = new c.a();
                aVar.a = com.sankuai.waimai.business.ugc.live.utils.c.f;
                aVar.b = i;
                aVar.c = this.e.b;
                aVar.d = this.e.c;
                aVar.e = com.sankuai.waimai.business.ugc.live.utils.b.a(this.e.e);
                aVar.f = getWidth();
                aVar.g = getHeight();
                aVar.h = this.e.d;
                com.sankuai.waimai.business.ugc.live.utils.c.a(aVar);
            }
        } else if (i == 2105 && e()) {
            try {
                Matcher matcher = Pattern.compile("[0-9]+").matcher(bundle.getString("EVT_MSG"));
                if (matcher.find()) {
                    float parseFloat = Float.parseFloat(matcher.group());
                    c.a aVar2 = new c.a();
                    aVar2.a = com.sankuai.waimai.business.ugc.live.utils.c.c;
                    aVar2.b = parseFloat;
                    aVar2.c = this.e.b;
                    aVar2.d = this.e.c;
                    aVar2.e = com.sankuai.waimai.business.ugc.live.utils.b.a(this.e.e);
                    aVar2.f = getWidth();
                    aVar2.g = getHeight();
                    aVar2.h = this.e.d;
                    com.sankuai.waimai.business.ugc.live.utils.c.a(aVar2);
                }
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.e(c, e.toString(), new Object[0]);
            }
            if (this.j) {
                return;
            }
            this.j = true;
            c.a aVar3 = new c.a();
            aVar3.a = com.sankuai.waimai.business.ugc.live.utils.c.d;
            aVar3.b = 1.0f;
            aVar3.c = this.e.b;
            aVar3.d = this.e.c;
            aVar3.e = com.sankuai.waimai.business.ugc.live.utils.b.a(this.e.e);
            aVar3.f = getWidth();
            aVar3.g = getHeight();
            aVar3.h = this.e.d;
            com.sankuai.waimai.business.ugc.live.utils.c.a(aVar3);
        }
    }

    @Override // com.sankuai.waimai.business.ugc.live.a.b
    public void onGoodsChanged(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26f2d0e36ef8c7c4f761589814855bb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26f2d0e36ef8c7c4f761589814855bb7");
        } else if (this.g != null) {
            this.g.a(i, j);
        }
    }

    @Override // com.sankuai.waimai.business.ugc.live.a.b
    public void onPlaySuccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60f1ee1562a97722eb495898b5fb70a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60f1ee1562a97722eb495898b5fb70a9");
            return;
        }
        d.a(d.c + "onPlaySuccess");
        if (!this.i) {
            this.i = true;
            if (e()) {
                c.a aVar = new c.a();
                aVar.a = com.sankuai.waimai.business.ugc.live.utils.c.b;
                aVar.b = (float) (System.currentTimeMillis() - this.h);
                aVar.c = this.e.b;
                aVar.d = this.e.c;
                aVar.e = com.sankuai.waimai.business.ugc.live.utils.b.a(this.e.e);
                aVar.f = getWidth();
                aVar.g = getHeight();
                aVar.h = this.e.d;
                com.sankuai.waimai.business.ugc.live.utils.c.a(aVar);
            }
        }
        if (this.g != null) {
            this.g.c();
        }
    }

    @Override // com.sankuai.waimai.business.ugc.live.a.b
    public void onPlayFail(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b950919abc82468725af63ab3dbf26fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b950919abc82468725af63ab3dbf26fb");
            return;
        }
        d.a(d.c + "onPlayFail");
        if (!this.i) {
            this.i = true;
            if (e()) {
                c.a aVar = new c.a();
                aVar.a = com.sankuai.waimai.business.ugc.live.utils.c.e;
                aVar.b = 0.0f;
                aVar.c = this.e.b;
                aVar.d = this.e.c;
                aVar.e = com.sankuai.waimai.business.ugc.live.utils.b.a(this.e.e);
                aVar.f = getWidth();
                aVar.g = getHeight();
                aVar.h = this.e.d;
                com.sankuai.waimai.business.ugc.live.utils.c.a(aVar);
            }
        }
        if (this.g != null) {
            this.g.a(i);
        }
    }

    @Override // com.sankuai.waimai.business.ugc.live.a.b
    public void onPlayEnd() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8b650938a0a55a8adfeec4f6a672f06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8b650938a0a55a8adfeec4f6a672f06");
            return;
        }
        d.a(d.c + "onPlayEnd");
        if (this.g != null) {
            this.g.d();
        }
    }

    @Override // com.sankuai.waimai.business.ugc.live.a.b
    public void onClicked() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e8eb26a940e39dc10b76f7bed8c4069", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e8eb26a940e39dc10b76f7bed8c4069");
        } else if (this.g != null) {
            this.g.e();
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6407d9dac2c738ab3547965aad8c6472", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6407d9dac2c738ab3547965aad8c6472");
            return;
        }
        if (this.f == null) {
            this.f = new com.sankuai.waimai.business.ugc.live.utils.a();
        }
        this.f.a(getContext(), null);
    }

    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dace5d301ed6ea12258a420ddd4eb6cd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dace5d301ed6ea12258a420ddd4eb6cd")).booleanValue();
        }
        if (this.d != null) {
            return this.d.a((ViewGroup) this);
        }
        return false;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public boolean g;
        public float h;
        public boolean i;
        public String j;
        public boolean k;
        public String l;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3912e6346074d832aed75c194ba578ed", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3912e6346074d832aed75c194ba578ed");
                return;
            }
            this.i = true;
            this.j = "fillCrop";
            this.k = false;
        }

        static a.d a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4059ca9e76a222e82d30110271967d49", RobustBitConfig.DEFAULT_VALUE)) {
                return (a.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4059ca9e76a222e82d30110271967d49");
            }
            a.d dVar = new a.d();
            dVar.a = bVar.b;
            dVar.b = bVar.d;
            dVar.c = bVar.e;
            dVar.d = bVar.f;
            dVar.e = bVar.h;
            dVar.f = bVar.i;
            dVar.g = bVar.j;
            return dVar;
        }
    }
}
