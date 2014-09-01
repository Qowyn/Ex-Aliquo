package exaliquo.data;

import cpw.mods.fml.common.gameevent.TickEvent.RenderTickEvent;

public class AliquoTickHandler
{

	public static int tick = 0;
	
	public void onRenderTick(RenderTickEvent event)
	{
        tick++;
        
        if (tick > 400) tick = 0;
	}
}
