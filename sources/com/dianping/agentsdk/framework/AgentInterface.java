package com.dianping.agentsdk.framework;

import android.content.Intent;
import android.os.Bundle;
import com.dianping.shield.lifecycle.PageLifecycleCallbacks;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import java.io.Serializable;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface AgentInterface extends PageLifecycleCallbacks {
    String getAgentCellName();

    HashMap<String, Serializable> getArguments();

    String getHostName();

    String getIndex();

    af getSectionCellInterface();

    ShieldSectionCellItem getSectionCellItem();

    void onActivityResult(int i, int i2, Intent intent);

    @Deprecated
    void onAgentChanged(Bundle bundle);

    void onCreate(Bundle bundle);

    void onDestroy();

    void onPause();

    void onResume();

    void onStart();

    void onStop();

    Bundle saveInstanceState();

    void setArguments(HashMap<String, Serializable> hashMap);

    void setHostName(String str);

    void setIndex(String str);
}
