package ac.grim.grimac.api.events;

import ac.grim.grimac.api.AbstractCheck;
import ac.grim.grimac.api.GrimUser;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Map;

@Getter
public class AlertEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();

    private final GrimUser user;
    private final AbstractCheck check;
    private final Map<String, Object> details;
    private final Collection<Player> receivers;

    private final boolean verbose;
    private @Setter boolean cancelled;

    public AlertEvent(GrimUser user,
                      AbstractCheck check,
                      Map<String, Object> details,
                      Collection<Player> receivers,
                      boolean verbose) {
        this.user = user;
        this.check = check;
        this.details = details;
        this.receivers = receivers;
        this.verbose = verbose;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

}
