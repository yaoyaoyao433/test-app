package com.sankuai.meituan.shortvideocore.mrn.cache;

import com.meituan.android.mtplayer.video.MTVideoPlayerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends HashMap<String, MTVideoPlayerView> {
    public static ChangeQuickRedirect a;
    private final int b;
    private final LinkedList<String> c;

    public a(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b86113a621834a77b48a8c701f9aaa8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b86113a621834a77b48a8c701f9aaa8c");
            return;
        }
        this.c = new LinkedList<>();
        this.b = i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a */
    public final MTVideoPlayerView put(String str, MTVideoPlayerView mTVideoPlayerView) {
        Object[] objArr = {str, mTVideoPlayerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee4811e639601379a42db216a26550ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTVideoPlayerView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee4811e639601379a42db216a26550ad");
        }
        StringBuilder sb = new StringBuilder("size:");
        sb.append(this.c.size());
        sb.append(",msize:");
        sb.append(this.b);
        sb.append(",key:");
        sb.append(str);
        if (this.c.size() >= this.b) {
            String removeFirst = this.c.removeFirst();
            MTVideoPlayerView mTVideoPlayerView2 = get(removeFirst);
            if (mTVideoPlayerView2 != null) {
                mTVideoPlayerView2.g();
            }
            super.remove(removeFirst);
        }
        if (this.c.contains(str)) {
            MTVideoPlayerView mTVideoPlayerView3 = get(str);
            StringBuilder sb2 = new StringBuilder("prevalue:");
            sb2.append(mTVideoPlayerView3);
            sb2.append("value");
            sb2.append(mTVideoPlayerView);
            if (mTVideoPlayerView3 != mTVideoPlayerView && mTVideoPlayerView3 != null) {
                mTVideoPlayerView3.g();
            }
        } else {
            this.c.add(str);
        }
        return (MTVideoPlayerView) super.put(str, mTVideoPlayerView);
    }

    public final MTVideoPlayerView a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac0751cfad2562ad1ac40a33d42c2e81", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTVideoPlayerView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac0751cfad2562ad1ac40a33d42c2e81");
        }
        this.c.remove(str);
        return (MTVideoPlayerView) super.remove(str);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46c544d5d169b26ae7b7689515725e00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46c544d5d169b26ae7b7689515725e00");
            return;
        }
        this.c.clear();
        super.clear();
    }
}
