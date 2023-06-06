package io.agora.rtc.video;

import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class ChannelMediaRelayConfiguration {
    private Map<String, ChannelMediaInfo> destInfos;
    private ChannelMediaInfo srcInfo;

    public ChannelMediaRelayConfiguration() {
        this.srcInfo = null;
        this.destInfos = null;
        this.destInfos = new HashMap();
        this.srcInfo = new ChannelMediaInfo(null, null, 0);
    }

    public void setSrcChannelInfo(ChannelMediaInfo channelMediaInfo) {
        this.srcInfo = channelMediaInfo;
    }

    public void setDestChannelInfo(String str, ChannelMediaInfo channelMediaInfo) {
        if (this.destInfos.size() < 4) {
            this.destInfos.put(str, channelMediaInfo);
        }
    }

    public void removeDestChannelInfo(String str) {
        this.destInfos.remove(str);
    }

    public ChannelMediaInfo getSrcChannelMediaInfo() {
        return this.srcInfo;
    }

    public Map<String, ChannelMediaInfo> getDestChannelMediaInfos() {
        return this.destInfos;
    }
}
