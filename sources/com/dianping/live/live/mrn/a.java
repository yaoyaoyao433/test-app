package com.dianping.live.live.mrn;

import com.dianping.live.live.mrn.list.e;
import com.dianping.live.live.utils.NetWorkStateReceiver;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface a {
    boolean a();

    boolean b();

    boolean c();

    e.a getChannelType();

    List<Integer> getCodes();

    int getIndexInChannel();

    String getLiveId();

    com.dianping.live.report.c getMLivePlayerStatusMonitor();

    NetWorkStateReceiver getPlayerNetWorkStateReceiver();

    NetWorkStateReceiver getPusherNetWorkStateReceiver();

    int getRetCode();

    long getStartTime();

    void setFftReported(boolean z);

    void setPlayerNetWorkStateReceiver(NetWorkStateReceiver netWorkStateReceiver);

    void setPusherNetWorkStateReceiver(NetWorkStateReceiver netWorkStateReceiver);

    void setmLivePlayConfig(com.sankuai.meituan.mtlive.player.library.d dVar);

    void setmLivePlayer(d dVar);

    void setmLivePlayerListener(com.sankuai.meituan.mtlive.player.library.b bVar);
}
