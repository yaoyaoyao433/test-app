package com.dianping.agentsdk.framework;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/dianping/agentsdk/framework/AutoExposeViewType;", "", "()V", "BecomeActiveReLog", "", "IgnoreScrolling", "PageBackReLog", "parse", "Lcom/dianping/agentsdk/framework/AutoExposeViewType$Type;", "typeCode", "Type", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public static final f b = new f();

    @NotNull
    public final a a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b828dda46c09d01774d8120930d011d", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b828dda46c09d01774d8120930d011d");
        }
        if (i != 4) {
            switch (i) {
                case 1:
                    return a.IgnoreScrolling;
                case 2:
                    return a.BecomeActiveReLog;
                default:
                    return a.Normal;
            }
        }
        return a.PageBackReLog;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dianping/agentsdk/framework/AutoExposeViewType$Type;", "", "(Ljava/lang/String;I)V", "Normal", "IgnoreScrolling", "BecomeActiveReLog", "PageBackReLog", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public enum a {
        Normal,
        IgnoreScrolling,
        BecomeActiveReLog,
        PageBackReLog;
        
        public static ChangeQuickRedirect a;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return (a) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06a1d2521dd171474039a08dd6c9f075", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06a1d2521dd171474039a08dd6c9f075") : Enum.valueOf(a.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return (a[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a5ec5571bb1996799f2d371dacfdbbc", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a5ec5571bb1996799f2d371dacfdbbc") : values().clone());
        }

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1581c2b26057dc43745055e40f9e139", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1581c2b26057dc43745055e40f9e139");
            }
        }
    }
}
