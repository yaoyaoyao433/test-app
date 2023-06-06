package com.dianping.nvnetwork.tunnel.Encrypt;

import android.os.Message;
import java.net.InetAddress;
/* loaded from: classes.dex */
public interface SocketSecureCell {
    InetAddress getSecureSocketAddress();

    boolean isSocketConnected();

    void notifyMessage(Message message);

    void readSecure(SocketSecureCell socketSecureCell);

    boolean writeSecure(SecureProtocolData secureProtocolData);
}
