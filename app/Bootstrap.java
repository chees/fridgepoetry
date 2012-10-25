import models.WordSet;
import play.Logger;
import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.test.Fixtures;

@OnApplicationStart
public class Bootstrap extends Job {
	public void doJob() {
		Logger.debug("Bootstrapping");
		if (WordSet.count() == 0) {
			Fixtures.loadModels("initial-data.yml");
		}
	}
}
