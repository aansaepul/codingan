package com.aansanwar.bercoding.Database;

import com.aansanwar.bercoding.Model.JoinEvent;
import com.aansanwar.bercoding.Model.User;

import java.util.List;

/**
 * Created by RAHASTRA PACET on 21/02/2017.
 */

public interface Dao
{
    public List<User> get();
    public List<User> getByUserId(String aUserId);
    public int registerLineId(String aUserId, String aLineId, String aDisplayName);
    public int joinEvent(String aEventId, String aUserId, String aLineId, String aDisplayName);
    public List<JoinEvent> getEvent();
    public List<JoinEvent> getByEventId(String aEventId);
    public List<JoinEvent> getByJoin(String aEventId, String aUserId);
}