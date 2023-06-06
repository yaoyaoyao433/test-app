package com.dianping.agentsdk.framework;

import android.content.Intent;
import android.os.Bundle;
import com.dianping.shield.lifecycle.PageLifecycleCallbacks;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface d extends PageLifecycleCallbacks {
    void destroyAgents();

    AgentInterface findAgent(String str);

    void initViewCell();

    void onActivityResult(int i, int i2, Intent intent);

    void onSaveInstanceState(Bundle bundle);

    void pauseAgents();

    List<rx.d> refreshAgents();

    void resetAgents(Bundle bundle, ArrayList<c> arrayList);

    void resumeAgents();

    void setupAgents(Bundle bundle, ArrayList<c> arrayList);

    void startAgents();

    void stopAgents();
}
