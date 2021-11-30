package sh.hella.html.document;

import sh.hella.html.Hella;
import sh.hella.html.event.Event;
import sh.hella.html.event.EventDispatcher;
import sh.hella.html.event.EventHandler;

import java.util.UUID;

import static sh.hella.html.Html.attr;


/**
 * The type Event aware attribute.
 */
public class EventAwareAttribute extends CompositeAttribute {

    /**
     * Instantiates a new Event aware attribute.
     *
     * @param attributeType the attribute type
     * @param eventType     the event type
     * @param eventHandler  the event handler
     */
    public <E extends Event> EventAwareAttribute(String attributeType, Class<E> eventType,
                                                 EventHandler<E> eventHandler) {
        String eventId = UUID.randomUUID().toString().replace("-", "");
        EventDispatcher<E> eventDispatcher = new EventDispatcher<>(eventType, eventHandler);
        Hella.CONTEXT.get().getEventDispatcherMap().put(eventId, eventDispatcher);
        add(
            attr("data-event-id", eventId),
            attr(attributeType, "_hella_event('" + eventId + "'); return false")
        );
    }
}
