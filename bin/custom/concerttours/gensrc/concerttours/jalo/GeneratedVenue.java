/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 20.01.2020 17:06:26                         ---
 * ----------------------------------------------------------------
 */
package concerttours.jalo;

import concerttours.constants.ConcerttoursConstants;
import concerttours.jalo.Concert;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Venue}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedVenue extends GenericItem
{
	/** Qualifier of the <code>Venue.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Venue.location</code> attribute **/
	public static final String LOCATION = "location";
	/** Qualifier of the <code>Venue.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Venue.concert</code> attribute **/
	public static final String CONCERT = "concert";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CONCERT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedVenue> CONCERTHANDLER = new BidirectionalOneToManyHandler<GeneratedVenue>(
	ConcerttoursConstants.TC.VENUE,
	false,
	"concert",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(LOCATION, AttributeMode.INITIAL);
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(CONCERT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Venue.code</code> attribute.
	 * @return the code - code of venue
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Venue.code</code> attribute.
	 * @return the code - code of venue
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Venue.code</code> attribute. 
	 * @param value the code - code of venue
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Venue.code</code> attribute. 
	 * @param value the code - code of venue
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Venue.concert</code> attribute.
	 * @return the concert
	 */
	public Concert getConcert(final SessionContext ctx)
	{
		return (Concert)getProperty( ctx, CONCERT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Venue.concert</code> attribute.
	 * @return the concert
	 */
	public Concert getConcert()
	{
		return getConcert( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Venue.concert</code> attribute. 
	 * @param value the concert
	 */
	public void setConcert(final SessionContext ctx, final Concert value)
	{
		CONCERTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Venue.concert</code> attribute. 
	 * @param value the concert
	 */
	public void setConcert(final Concert value)
	{
		setConcert( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CONCERTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Venue.location</code> attribute.
	 * @return the location - location of venue
	 */
	public String getLocation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOCATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Venue.location</code> attribute.
	 * @return the location - location of venue
	 */
	public String getLocation()
	{
		return getLocation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Venue.location</code> attribute. 
	 * @param value the location - location of venue
	 */
	public void setLocation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOCATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Venue.location</code> attribute. 
	 * @param value the location - location of venue
	 */
	public void setLocation(final String value)
	{
		setLocation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Venue.name</code> attribute.
	 * @return the name - name of venue
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Venue.name</code> attribute.
	 * @return the name - name of venue
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Venue.name</code> attribute. 
	 * @param value the name - name of venue
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Venue.name</code> attribute. 
	 * @param value the name - name of venue
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
